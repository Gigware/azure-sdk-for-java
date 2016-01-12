/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.management.website.models.Domain;
import com.microsoft.azure.management.website.models.DomainCollection;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.PATCH;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in DomainsOperations.
 */
public interface DomainsOperations {
    /**
     * The interface defining all the services for DomainsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DomainsService {
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains")
        Call<ResponseBody> getDomains(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}")
        Call<ResponseBody> getDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}")
        Call<ResponseBody> createOrUpdateDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Body Domain domain, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Query("forceHardDeleteDomain") Boolean forceHardDeleteDomain, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}")
        Call<ResponseBody> updateDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Body Domain domain, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}/operationresults/{operationId}")
        Call<ResponseBody> getDomainOperation(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DomainCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<DomainCollection> getDomains(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDomainsAsync(String resourceGroupName, final ServiceCallback<DomainCollection> serviceCallback);

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Domain> getDomain(String resourceGroupName, String domainName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDomainAsync(String resourceGroupName, String domainName, final ServiceCallback<Domain> serviceCallback);

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Domain> createOrUpdateDomain(String resourceGroupName, String domainName, Domain domain) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateDomainAsync(String resourceGroupName, String domainName, Domain domain, final ServiceCallback<Domain> serviceCallback);

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> deleteDomain(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteDomainAsync(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain, final ServiceCallback<Object> serviceCallback);

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Domain> updateDomain(String resourceGroupName, String domainName, Domain domain) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> updateDomainAsync(String resourceGroupName, String domainName, Domain domain, final ServiceCallback<Domain> serviceCallback);

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Domain> getDomainOperation(String resourceGroupName, String domainName, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDomainOperationAsync(String resourceGroupName, String domainName, String operationId, final ServiceCallback<Domain> serviceCallback);

}
