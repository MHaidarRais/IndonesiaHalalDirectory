package com.rais.haidar.indonesiahalaldirectory.Network;

import com.rais.haidar.indonesiahalaldirectory.Model.IsiKategori.ResponseIsiKategori;
import com.rais.haidar.indonesiahalaldirectory.Model.ListKategori.ResponseListKategori;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hoidar on 10/5/18.
 */

public interface ApiService {
    @GET("?menu=semua_kategori")
    Call<ResponseListKategori> readListKategori();

    @GET("?menu=a.kategori_id&query=1&page=1")
    Call<ResponseIsiKategori> readIsiKategori();

}
