package com.omdeep.newsapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<NewsModel> getAllNews(@Url String url);

    @GET
    Call<NewsModel>getNewsByCategory(@Url String url);


}
