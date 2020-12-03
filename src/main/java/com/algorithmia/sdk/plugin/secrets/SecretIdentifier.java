package com.algorithmia.sdk.plugin.secrets;

/**
 * Provides information that can be used to uniquely identify a secret.
 */
public interface SecretIdentifier {
    /**
     * Request the value the provider produces for the key.
     *
     * @return the provider key in string format
     */
    public String getProviderKey();
}
