package com.algorithmia.sdk.plugin.secrets;

/**
 * The simplest possible secret implementation.
 */
public class SimpleSecret implements Secret {
    private final String _value;
    private final int _ttl;
    public SimpleSecret(String value, int ttl) {
        _value = value;
        _ttl = ttl;
    }
    public SimpleSecret(String value) {
        this(value, 0);
    }
    public String getValue() {
        return _value;
    }
    public int getTtl() {
        return _ttl;
    }
}
