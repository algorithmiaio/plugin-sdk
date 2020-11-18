package com.algorithmia.sdk.plugin.secrets;

/**
 * Interface for implementing a factory for creating secret providers.  Calling
 * code will instantiate the factory and use that to create providers.
 */
public interface SecretProviderFactory {
    /**
     * Creates a secret provider that can be used by the host.
     *
     * @param  config a set of key/value pairs used by the provider factory
     *                to configure the produced provider
     * @return        a secret provider that implements the
     *                SecretProvider interface
     */
    public SecretProvider create(java.util.Map<String, String> config);
}
