package com.rais.haidar.indonesiahalaldirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.rais.haidar.indonesiahalaldirectory.Model.ListKategori.ResponseListKategori;
import com.rais.haidar.indonesiahalaldirectory.Network.ApiService;
import com.rais.haidar.indonesiahalaldirectory.Network.InstanceRetrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IsiKategori extends AppCompatActivity {

    RecyclerView rcViewIsi;
    CustomAdapter adapter;
    String BASE_URL = "http://api.agusadiyanto.net/halal/?menu=a.kategori_id&query=";
    String END_URL = "&page=0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_kategori);

        rcViewIsi = findViewById(R.id.RCViewIsiKategori);

        getData();
    }

    private void getData() {
        final ApiService apiService = InstanceRetrofit.getInstance();
        Call<ResponseListKategori> call = apiService.readListKategori();
        call.enqueue(new Callback<ResponseListKategori>() {
            @Override
            public void onResponse(Call<ResponseListKategori> call, Response<ResponseListKategori> response) {

            }

            @Override
            public void onFailure(Call<ResponseListKategori> call, Throwable t) {

            }
        });
    }

    private class CustomAdapter extends RecyclerView.Adapter<MyViewHolder>{
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
