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

import com.microsoft.azure.management.website.models.CertificateCollection;
import com.microsoft.azure.management.website.models.ClassicMobileServiceCollection;
import com.microsoft.azure.management.website.models.GeoRegionCollection;
import com.microsoft.azure.management.website.models.HostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.ManagedHostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.ResourceNameAvailability;
import com.microsoft.azure.management.website.models.ResourceNameAvailabilityRequest;
import com.microsoft.azure.management.website.models.ServerFarmCollection;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.azure.management.website.models.User;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in GlobalOperations.
 */
public interface GlobalOperations {
    /**
     * The interface defining all the services for GlobalOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GlobalService {
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/publishingCredentials")
        Call<ResponseBody> getSubscriptionPublishingCredentials(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/providers/Microsoft.Web/publishingCredentials")
        Call<ResponseBody> updateSubscriptionPublishingCredentials(@Path("subscriptionId") String subscriptionId, @Body User requestMessage, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/geoRegions")
        Call<ResponseBody> getSubscriptionGeoRegions(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/certificates")
        Call<ResponseBody> getAllCertificates(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/serverfarms")
        Call<ResponseBody> getAllServerFarms(@Path("subscriptionId") String subscriptionId, @Query("detailed") Boolean detailed, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/sites")
        Call<ResponseBody> getAllSites(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/hostingEnvironments")
        Call<ResponseBody> getAllHostingEnvironments(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/managedHostingEnvironments")
        Call<ResponseBody> getAllManagedHostingEnvironments(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/classicMobileServices")
        Call<ResponseBody> getAllClassicMobileServices(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/premieraddonoffers")
        Call<ResponseBody> listPremierAddOnOffers(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/ishostingenvironmentnameavailable/{name}")
        Call<ResponseBody> isHostingEnvironmentWithLegacyNameAvailable(@Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/ishostingenvironmentnameavailable")
        Call<ResponseBody> isHostingEnvironmentNameAvailable(@Path("subscriptionId") String subscriptionId, @Query("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Web/checknameavailability")
        Call<ResponseBody> checkNameAvailability(@Path("subscriptionId") String subscriptionId, @Body ResourceNameAvailabilityRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets publishing credentials for the subscription owner.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<User> getSubscriptionPublishingCredentials() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets publishing credentials for the subscription owner.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSubscriptionPublishingCredentialsAsync(final ServiceCallback<User> serviceCallback);

    /**
     * Updates publishing credentials for the subscription owner.
     *
     * @param requestMessage requestMessage with new publishing credentials
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<User> updateSubscriptionPublishingCredentials(User requestMessage) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates publishing credentials for the subscription owner.
     *
     * @param requestMessage requestMessage with new publishing credentials
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> updateSubscriptionPublishingCredentialsAsync(User requestMessage, final ServiceCallback<User> serviceCallback);

    /**
     * Gets list of available geo regions.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the GeoRegionCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<GeoRegionCollection> getSubscriptionGeoRegions() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets list of available geo regions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSubscriptionGeoRegionsAsync(final ServiceCallback<GeoRegionCollection> serviceCallback);

    /**
     * Get all certificates for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CertificateCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<CertificateCollection> getAllCertificates() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all certificates for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAllCertificatesAsync(final ServiceCallback<CertificateCollection> serviceCallback);

    /**
     * Gets all App Service Plans for a subcription.
     *
     * @param detailed False to return a subset of App Service Plan properties, true to return all of the properties.
             Retrieval of all properties may increase the API latency.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ServerFarmCollection> getAllServerFarms(Boolean detailed) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all App Service Plans for a subcription.
     *
     * @param detailed False to return a subset of App Service Plan properties, true to return all of the properties.
             Retrieval of all properties may increase the API latency.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAllServerFarmsAsync(Boolean detailed, final ServiceCallback<ServerFarmCollection> serviceCallback);

    /**
     * Gets all Web Apps for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<SiteCollection> getAllSites() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all Web Apps for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAllSitesAsync(final ServiceCallback<SiteCollection> serviceCallback);

    /**
     * Gets all hostingEnvironments (App Service Environment) for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironmentCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<HostingEnvironmentCollection> getAllHostingEnvironments() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all hostingEnvironments (App Service Environment) for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAllHostingEnvironmentsAsync(final ServiceCallback<HostingEnvironmentCollection> serviceCallback);

    /**
     * Gets all managed hosting environments for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagedHostingEnvironmentCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagedHostingEnvironmentCollection> getAllManagedHostingEnvironments() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all managed hosting environments for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAllManagedHostingEnvironmentsAsync(final ServiceCallback<ManagedHostingEnvironmentCollection> serviceCallback);

    /**
     * Gets all mobile services for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ClassicMobileServiceCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ClassicMobileServiceCollection> getAllClassicMobileServices() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all mobile services for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAllClassicMobileServicesAsync(final ServiceCallback<ClassicMobileServiceCollection> serviceCallback);

    /**
     * List premier add on offers.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> listPremierAddOnOffers() throws CloudException, IOException, IllegalArgumentException;

    /**
     * List premier add on offers.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listPremierAddOnOffersAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> isHostingEnvironmentWithLegacyNameAvailable(String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> isHostingEnvironmentWithLegacyNameAvailableAsync(String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> isHostingEnvironmentNameAvailable(String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> isHostingEnvironmentNameAvailableAsync(String name, final ServiceCallback<Object> serviceCallback);

    /**
     * Check if resource name is available.
     *
     * @param request Name availability request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceNameAvailability object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceNameAvailability> checkNameAvailability(ResourceNameAvailabilityRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Check if resource name is available.
     *
     * @param request Name availability request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> checkNameAvailabilityAsync(ResourceNameAvailabilityRequest request, final ServiceCallback<ResourceNameAvailability> serviceCallback);

}
