package com.john.mvpframework.repository;




import java.util.Map;

import io.reactivex.Completable;
import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;


public interface RetrofitService {

    /*@Multipart
    @POST("{endPoint}")
    Single<ModelResponse> requestApi(@Part MultipartBody.Part[] file,
                                     @PartMap() Map<String, RequestBody> partMap,
                                     @Path(value = "endPoint", encoded = true) String endPoint);

    @POST("{endPoint}")
    Single<ModelResponse> requestApi(@Body Object object,
                                     @Path(value = "endPoint", encoded = true) String endPoint);

    @POST("{endPoint}")
    Completable postToApi(@Body Object object,
                          @Path(value = "endPoint", encoded = true) String endPoint);*/

}
