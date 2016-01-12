/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.models.PageImpl;
import com.microsoft.azure.management.compute.models.VirtualMachine;
import com.microsoft.azure.management.compute.models.VirtualMachineCaptureParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineCaptureResult;
import com.microsoft.azure.management.compute.models.VirtualMachineSizeListResult;
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
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachinesOperations.
 */
public interface VirtualMachinesOperations {
    /**
     * The interface defining all the services for VirtualMachinesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachinesService {
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/capture")
        Call<ResponseBody> capture(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineCaptureParameters parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachine parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("$expand") String expand, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/deallocate")
        Call<ResponseBody> deallocate(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/generalize")
        Call<ResponseBody> generalize(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/virtualMachines")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/vmSizes")
        Call<ResponseBody> listAvailableSizes(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/powerOff")
        Call<ResponseBody> powerOff(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/restart")
        Call<ResponseBody> restart(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/start")
        Call<ResponseBody> start(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAvailableSizesNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Captures the VM by copying VirtualHardDisks of the VM and outputs a template that can be used to create similar VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Capture Virtual Machine operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachineCaptureResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineCaptureResult> capture(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Captures the VM by copying VirtualHardDisks of the VM and outputs a template that can be used to create similar VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Capture Virtual Machine operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> captureAsync(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters, final ServiceCallback<VirtualMachineCaptureResult> serviceCallback);

    /**
     * The operation to create or update a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Create Virtual Machine operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachine object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachine> createOrUpdate(String resourceGroupName, String vmName, VirtualMachine parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to create or update a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Create Virtual Machine operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String vmName, VirtualMachine parameters, final ServiceCallback<VirtualMachine> serviceCallback);

    /**
     * The operation to delete a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to delete a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String vmName, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to get a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param expand The expand expression to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachine object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachine> get(String resourceGroupName, String vmName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to get a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param expand The expand expression to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String vmName, String expand, final ServiceCallback<VirtualMachine> serviceCallback);

    /**
     * Shuts down the Virtual Machine and releases the compute resources. You are not billed for the compute resources that this Virtual Machine uses.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deallocate(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Shuts down the Virtual Machine and releases the compute resources. You are not billed for the compute resources that this Virtual Machine uses.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deallocateAsync(String resourceGroupName, String vmName, final ServiceCallback<Void> serviceCallback);

    /**
     * Sets the state of the VM as Generalized.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> generalize(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Sets the state of the VM as Generalized.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> generalizeAsync(String resourceGroupName, String vmName, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to list virtual machines under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualMachine&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualMachine>> list(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to list virtual machines under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<VirtualMachine>> serviceCallback);

    /**
     * Gets the list of Virtual Machines in the subscription. Use nextLink property in the response to get the next page of Virtual Machines. Do this till nextLink is not null to fetch all the Virtual Machines.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualMachine&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualMachine>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the list of Virtual Machines in the subscription. Use nextLink property in the response to get the next page of Virtual Machines. Do this till nextLink is not null to fetch all the Virtual Machines.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<VirtualMachine>> serviceCallback);

    /**
     * Lists virtual-machine-sizes available to be used for a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineSizeListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineSizeListResult> listAvailableSizes(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available to be used for a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAvailableSizesAsync(String resourceGroupName, String vmName, final ServiceCallback<VirtualMachineSizeListResult> serviceCallback);

    /**
     * The operation to power off (stop) a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> powerOff(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to power off (stop) a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> powerOffAsync(String resourceGroupName, String vmName, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to restart a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> restart(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to restart a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> restartAsync(String resourceGroupName, String vmName, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to start a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> start(String resourceGroupName, String vmName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The operation to start a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> startAsync(String resourceGroupName, String vmName, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to list virtual machines under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualMachine&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualMachine>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The operation to list virtual machines under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualMachine>> serviceCallback);

    /**
     * Gets the list of Virtual Machines in the subscription. Use nextLink property in the response to get the next page of Virtual Machines. Do this till nextLink is not null to fetch all the Virtual Machines.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualMachine&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualMachine>> listAllNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the list of Virtual Machines in the subscription. Use nextLink property in the response to get the next page of Virtual Machines. Do this till nextLink is not null to fetch all the Virtual Machines.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualMachine>> serviceCallback);

    /**
     * Lists virtual-machine-sizes available to be used for a virtual machine.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineSizeListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineSizeListResult> listAvailableSizesNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available to be used for a virtual machine.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAvailableSizesNextAsync(String nextPageLink, final ServiceCallback<VirtualMachineSizeListResult> serviceCallback);

}
