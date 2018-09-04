package com.meghna125.nearbyplaces.Remote;

import com.meghna125.nearbyplaces.model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {

    @GET
    Call<MyPlaces> getNearbyPlaces(@Url String url);
}
