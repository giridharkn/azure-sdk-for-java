/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.batch.ErrorBodyException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Locations.
 */
public final class LocationsInner {
    /** The Retrofit service to perform REST calls. */
    private LocationsService service;
    /** The service client containing this operation class. */
    private BatchManagementClientImpl client;

    /**
     * Initializes an instance of LocationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocationsInner(Retrofit retrofit, BatchManagementClientImpl client) {
        this.service = retrofit.create(LocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Locations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.batch.Locations getQuotas" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Batch/locations/{locationName}/quotas")
        Observable<Response<ResponseBody>> getQuotas(@Path("locationName") String locationName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The desired region for the quotas.
     * @return the BatchLocationQuotaInner object if successful.
     */
    public BatchLocationQuotaInner getQuotas(String locationName) {
        return getQuotasWithServiceResponseAsync(locationName).toBlocking().single().body();
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The desired region for the quotas.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<BatchLocationQuotaInner> getQuotasAsync(String locationName, final ServiceCallback<BatchLocationQuotaInner> serviceCallback) {
        return ServiceCall.fromResponse(getQuotasWithServiceResponseAsync(locationName), serviceCallback);
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The desired region for the quotas.
     * @return the observable to the BatchLocationQuotaInner object
     */
    public Observable<BatchLocationQuotaInner> getQuotasAsync(String locationName) {
        return getQuotasWithServiceResponseAsync(locationName).map(new Func1<ServiceResponse<BatchLocationQuotaInner>, BatchLocationQuotaInner>() {
            @Override
            public BatchLocationQuotaInner call(ServiceResponse<BatchLocationQuotaInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     *
     * @param locationName The desired region for the quotas.
     * @return the observable to the BatchLocationQuotaInner object
     */
    public Observable<ServiceResponse<BatchLocationQuotaInner>> getQuotasWithServiceResponseAsync(String locationName) {
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getQuotas(locationName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BatchLocationQuotaInner>>>() {
                @Override
                public Observable<ServiceResponse<BatchLocationQuotaInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BatchLocationQuotaInner> clientResponse = getQuotasDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BatchLocationQuotaInner> getQuotasDelegate(Response<ResponseBody> response) throws ErrorBodyException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BatchLocationQuotaInner, ErrorBodyException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BatchLocationQuotaInner>() { }.getType())
                .registerError(ErrorBodyException.class)
                .build(response);
    }

}