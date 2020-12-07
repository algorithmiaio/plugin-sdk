package com.algorithmia.sdk.plugin.secrets;

import java.time.Instant;

/**
 * Interface for implementing a secret provider
 */
public interface SecretProvider {
    /**
     * Returns a secret based on provided SecretIdentifier.
     *
     * @param  id an identifier that uniquely identifies a secret
     * @return    a Secret from the secret provider
     */
    public Secret getSecret(SecretIdentifier id)
        throws SecretNotFoundException;
    /**
     * Returns a version identifier for a secret base on provided SecretIdentifier.
     * The intent of this method is to allow the caller to determine if a secret
     * has changed without needing to call getSecret.
     *
     * The returned identifier should not reveal any information about the secret itself.
     * The only contract is that the returned identifier should change after updateSecret()
     * is called but otherwise be stable.
     *
     * @param  id an identifier that uniquely identifies a secret
     * @return    a version identifer
     */
    public String getSecretVersion(SecretIdentifier id)
        throws SecretNotFoundException;
 
    /**
     * Creates a secret based on provided value and returns a SecretIdentifier.
     *
     * @param  id an identifier that uniquely identifies a secret
     * @return    a Secret from the secret provider
     */
    public SecretIdentifier createSecret(String value);
    /**
     * Updates a secret based on provided SecretIdentifier and value and returns
     * a SecretIdentifier.
     *
     * @param  id an identifier that uniquely identifies a secret
     * @return    a Secret from the secret provider
     */
    public SecretIdentifier updateSecret(SecretIdentifier id, String value)
        throws SecretNotFoundException;
    /**
     * Deletes a secret based on provided SecretIdentifier and returns a boolean
     * indicating whether or not the deletion succeeded.
     *
     * @param  id an identifier that uniquely identifies a secret
     * @return    a Secret from the secret provider
     */
    public boolean deleteSecret(SecretIdentifier id)
        throws SecretNotFoundException;
    /**
     * Retrieve a UTC time that a given secret was last updated/invalidated
     *
     * @param id
     */
    public Instant secretLastUpdated(SecretIdentifier id);
    /**
     * Retrieve time to live (TTL) for the secret provider
     * object before a new one must be created.
     *
     * @return the TTL in seconds of the provider
     */
    public int getTtl();
    /**
     * Indicates whether the provider supports secret creation.
     *
     * @return boolean does the provider allow secret creation
     */
    public boolean allowsCreate();
    /**
     * Indicates whether the provider supports secret update.
     *
     * @return boolean does the provider allow secret update
     */
    public boolean allowsUpdate();
    /**
     * Indicates whether the provider supports secret deletion.
     *
     * @return boolean does the provider allow secret delete
     */
    public boolean allowsDelete();
}
