package com.rais.haidar.indonesiahalaldirectory.Model.IsiKategori;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("nama_produk")
	private String namaProduk;

	@SerializedName("tes")
	private String tes;

	@SerializedName("nama_produsen")
	private String namaProdusen;

	@SerializedName("nomor_sertifikat")
	private String nomorSertifikat;

	@SerializedName("berlaku_hingga")
	private String berlakuHingga;

	public void setNamaProduk(String namaProduk){
		this.namaProduk = namaProduk;
	}

	public String getNamaProduk(){
		return namaProduk;
	}

	public void setTes(String tes){
		this.tes = tes;
	}

	public String getTes(){
		return tes;
	}

	public void setNamaProdusen(String namaProdusen){
		this.namaProdusen = namaProdusen;
	}

	public String getNamaProdusen(){
		return namaProdusen;
	}

	public void setNomorSertifikat(String nomorSertifikat){
		this.nomorSertifikat = nomorSertifikat;
	}

	public String getNomorSertifikat(){
		return nomorSertifikat;
	}

	public void setBerlakuHingga(String berlakuHingga){
		this.berlakuHingga = berlakuHingga;
	}

	public String getBerlakuHingga(){
		return berlakuHingga;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"nama_produk = '" + namaProduk + '\'' + 
			",tes = '" + tes + '\'' + 
			",nama_produsen = '" + namaProdusen + '\'' + 
			",nomor_sertifikat = '" + nomorSertifikat + '\'' + 
			",berlaku_hingga = '" + berlakuHingga + '\'' + 
			"}";
		}
}