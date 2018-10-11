package com.rais.haidar.indonesiahalaldirectory;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rais.haidar.indonesiahalaldirectory.Model.IsiKategori.DataItem;
import com.rais.haidar.indonesiahalaldirectory.Model.ListKategori.ResponseListKategori;
import com.rais.haidar.indonesiahalaldirectory.Model.ListKategori.SemuaKategoriItem;
import com.rais.haidar.indonesiahalaldirectory.Network.ApiService;
import com.rais.haidar.indonesiahalaldirectory.Network.InstanceRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

   RecyclerView rcViewListKategori;
    CustomAdapter adapter;
    List<SemuaKategoriItem> id_kategori;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcViewListKategori = findViewById(R.id.RCViewListKategori);
        getData();
    }

    private void getData() {
        final ApiService apiService = InstanceRetrofit.getInstance();
        Call<ResponseListKategori> call = apiService.readListKategori();
        call.enqueue(new Callback<ResponseListKategori>() {
            @Override
            public void onResponse(Call<ResponseListKategori> call, Response<ResponseListKategori> response) {
                List<SemuaKategoriItem> isiListKategori = response.body().getSemuaKategori();

                adapter = new CustomAdapter(MainActivity.this, isiListKategori);

                rcViewListKategori.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                rcViewListKategori.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseListKategori> call, Throwable t) {

            }
        });
    }

    private class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {

        Context context;
        List<SemuaKategoriItem> isiListKategori;

        public CustomAdapter(Context context, List<SemuaKategoriItem> isiListKategori) {
            this.context = context;
            this.isiListKategori = isiListKategori;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.txtNamaKategori.setText(isiListKategori.get(position).getNama());
            holder.idKategori.setText(isiListKategori.get(position).getKategoriId());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        @Override
        public int getItemCount() {
            return isiListKategori.size();
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaKategori,idKategori;
        public MyViewHolder(View itemView) {
            super(itemView);
            txtNamaKategori = itemView.findViewById(R.id.txt_namakategori);
            idKategori = itemView.findViewById(R.id.txt_idkategori);
        }
    }
}
