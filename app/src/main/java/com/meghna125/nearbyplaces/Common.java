package com.meghna125.nearbyplaces;

import com.meghna125.nearbyplaces.Remote.IGoogleAPIService;
import com.meghna125.nearbyplaces.Remote.RetrofitClient;

import retrofit2.Retrofit;

public class Common {

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService(){

        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
