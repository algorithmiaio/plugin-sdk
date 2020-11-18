package com.algorithmia.sdk.plugin.secrets;

public class SecretNotFoundException extends Exception {
    public SecretNotFoundException(String message) {
        super(message);
    }
}
