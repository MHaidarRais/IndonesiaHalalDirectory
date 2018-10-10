package com.rais.haidar.indonesiahalaldirectory.Model.ListKategori;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseListKategori{

	@SerializedName("semua_kategori")
	private List<SemuaKategoriItem> semuaKategori;

	public void setSemuaKategori(List<SemuaKategoriItem> semuaKategori){
		this.semuaKategori = semuaKategori;
	}

	public List<SemuaKategoriItem> getSemuaKategori(){
		return semuaKategori;
	}

	@Override
 	public String toString(){
		return 
			"ResponseListKategori{" + 
			"semua_kategori = '" + semuaKategori + '\'' + 
			"}";
		}
}