package com.example.yanafriyoko.tanaman.rest;

/**
 * Created by root on 2/3/17.
 */

import com.example.yanafriyoko.tanaman.model.GetBuku;
import com.example.yanafriyoko.tanaman.model.PostPutDelBuku;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {

    @GET("tanaman")
    Call<GetBuku> getBuku();

    @FormUrlEncoded
    @POST("tanaman")
    Call<PostPutDelBuku> postBuku(@Field("id_tanaman") String id_buku,
                                  @Field("nama_tanaman") String nama_buku,
                                  @Field("jenis_tanaman") String harga_buku,
                                  @Field("harga_tanaman") String total);

    @FormUrlEncoded
    @PUT("tanaman")
    Call<PostPutDelBuku> putBuku(@Field("id_tanaman") String id_buku,
                                 @Field("nama_tanaman") String nama_buku,
                                 @Field("jenis_tanaman") String harga_buku,
                                 @Field("harga_tanaman") String total);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "tanaman", hasBody = true)
    Call<PostPutDelBuku> deleteBuku(@Field("id_tanaman") String id_buku);

}
