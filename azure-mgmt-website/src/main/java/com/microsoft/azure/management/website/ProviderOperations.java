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

import com.microsoft.azure.management.website.models.SourceControl;
import com.microsoft.azure.management.website.models.SourceControlCollection;
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
import retrofit.http.PUT;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in ProviderOperations.
 */
public interface ProviderOperations {
    /**
     * The interface defining all the services for ProviderOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProviderService {
        @GET("providers/Microsoft.Web/sourcecontrols")
        Call<ResponseBody> getSourceControls(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("providers/Microsoft.Web/sourcecontrols/{sourceControlType}")
        Call<ResponseBody> getSourceControl(@Path("sourceControlType") String sourceControlType, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("providers/Microsoft.Web/sourcecontrols/{sourceControlType}")
        Call<ResponseBody> updateSourceControl(@Path("sourceControlType") String sourceControlType, @Body SourceControl requestMessage, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("providers/Microsoft.Web/publishingUsers/web")
        Call<ResponseBody> getPublishingUser(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("providers/Microsoft.Web/publishingUsers/web")
        Call<ResponseBody> updatePublishingUser(@Body User requestMessage, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets the source controls available for Azure websites.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControlCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<SourceControlCollection> getSourceControls() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the source controls available for Azure websites.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSourceControlsAsync(final ServiceCallback<SourceControlCollection> serviceCallback);

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControl object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<SourceControl> getSourceControl(String sourceControlType) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSourceControlAsync(String sourceControlType, final ServiceCallback<SourceControl> serviceCallback);

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control
     * @param requestMessage Source control token information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControl object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<SourceControl> updateSourceControl(String sourceControlType, SourceControl requestMessage) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control
     * @param requestMessage Source control token information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> updateSourceControlAsync(String sourceControlType, SourceControl requestMessage, final ServiceCallback<SourceControl> serviceCallback);

    /**
     * Gets publishing user.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<User> getPublishingUser() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets publishing user.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPublishingUserAsync(final ServiceCallback<User> serviceCallback);

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<User> updatePublishingUser(User requestMessage) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> updatePublishingUserAsync(User requestMessage, final ServiceCallback<User> serviceCallback);

}
