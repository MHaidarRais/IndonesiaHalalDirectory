package com.rais.haidar.indonesiahalaldirectory.Model.IsiKategori;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseIsiKategori{

	@SerializedName("next_page")
	private int nextPage;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("query")
	private String query;

	@SerializedName("this_page")
	private int thisPage;

	@SerializedName("menu")
	private String menu;

	@SerializedName("prev_page")
	private int prevPage;

	@SerializedName("status")
	private String status;

	public void setNextPage(int nextPage){
		this.nextPage = nextPage;
	}

	public int getNextPage(){
		return nextPage;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setThisPage(int thisPage){
		this.thisPage = thisPage;
	}

	public int getThisPage(){
		return thisPage;
	}

	public void setMenu(String menu){
		this.menu = menu;
	}

	public String getMenu(){
		return menu;
	}

	public void setPrevPage(int prevPage){
		this.prevPage = prevPage;
	}

	public int getPrevPage(){
		return prevPage;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseIsiKategori{" + 
			"next_page = '" + nextPage + '\'' + 
			",data = '" + data + '\'' + 
			",query = '" + query + '\'' + 
			",this_page = '" + thisPage + '\'' + 
			",menu = '" + menu + '\'' + 
			",prev_page = '" + prevPage + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}