package com.rais.haidar.indonesiahalaldirectory.Model.ListKategori;

import com.google.gson.annotations.SerializedName;

public class SemuaKategoriItem{

	@SerializedName("kategori_id")
	private String kategoriId;

	@SerializedName("nama")
	private String nama;

	public void setKategoriId(String kategoriId){
		this.kategoriId = kategoriId;
	}

	public String getKategoriId(){
		return kategoriId;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	@Override
 	public String toString(){
		return 
			"SemuaKategoriItem{" + 
			"kategori_id = '" + kategoriId + '\'' + 
			",nama = '" + nama + '\'' + 
			"}";
		}
}