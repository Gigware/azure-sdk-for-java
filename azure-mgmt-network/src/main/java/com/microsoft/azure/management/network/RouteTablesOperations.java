/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.RouteTable;
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
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in RouteTablesOperations.
 */
public interface RouteTablesOperations {
    /**
     * The interface defining all the services for RouteTablesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RouteTablesService {
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("subscriptionId") String subscriptionId, @Body RouteTable parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/routeTables")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The Delete RouteTable operation deletes the specifed Route Table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String routeTableName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete RouteTable operation deletes the specifed Route Table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String routeTableName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get RouteTables operation retrieves information about the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RouteTable object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<RouteTable> get(String resourceGroupName, String routeTableName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get RouteTables operation retrieves information about the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String routeTableName, String expand, final ServiceCallback<RouteTable> serviceCallback);

    /**
     * The Put RouteTable operation creates/updates a route tablein the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create/update Route Table operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the RouteTable object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<RouteTable> createOrUpdate(String resourceGroupName, String routeTableName, RouteTable parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put RouteTable operation creates/updates a route tablein the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Parameters supplied to the create/update Route Table operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String routeTableName, RouteTable parameters, final ServiceCallback<RouteTable> serviceCallback);

    /**
     * The list RouteTables returns all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;RouteTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<RouteTable>> list(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list RouteTables returns all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<RouteTable>> serviceCallback);

    /**
     * The list RouteTables returns all route tables in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;RouteTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<RouteTable>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list RouteTables returns all route tables in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<RouteTable>> serviceCallback);

    /**
     * The list RouteTables returns all route tables in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;RouteTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<RouteTable>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list RouteTables returns all route tables in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<RouteTable>> serviceCallback);

    /**
     * The list RouteTables returns all route tables in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;RouteTable&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<RouteTable>> listAllNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list RouteTables returns all route tables in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<RouteTable>> serviceCallback);

}
