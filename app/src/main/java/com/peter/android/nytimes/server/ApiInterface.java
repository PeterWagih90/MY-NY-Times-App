package com.peter.android.nytimes.server;

import com.peter.android.nytimes.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Peter Zaky on 2019-04-16.
 */

public interface ApiInterface {

    @GET("mostpopular/v2/mostviewed/{section}/{period}.json")
    Call<ApiResponse> getNewsDetails(@Path("section") String section, @Path("period") String period,
                                     @Query("api-key") String apiKey);
}
