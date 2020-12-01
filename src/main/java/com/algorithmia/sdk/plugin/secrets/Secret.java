package com.algorithmia.sdk.plugin.secrets;

/**
 * Secret value produced by a secret provider.
 */
public interface Secret {
    /**
     * Returns the string value of the secret.
     *
     * @return the string value of the secret
     */
    public String getValue();
    /**
     * Returns the time to live (TTL) of the secret in seconds.
     * A value of 0 indicates that the secret does not expire.
     *
     * @return the TTL in seconds of the secret
     */
    public int getTtl();
}
