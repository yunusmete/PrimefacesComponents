package com.mete.yunus.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class TestBean implements Serializable{

	private String oRenk = "0f0f0f0f";
	private String aRenk = "3f4c21df";
	
	public String getStyle(){
		String stil = String.format("renk: #%s; arkaplan renk: #%s", oRenk, aRenk);
		return stil;
	}
	
	public String yonlendir(){
		return "sonuc";
	}
	
	public String getoRenk() {
		return oRenk;
	}
	public void setoRenk(String oRenk) {
		this.oRenk = oRenk;
	}
	public String getaRenk() {
		return aRenk;
	}
	public void setaRenk(String aRenk) {
		this.aRenk = aRenk;
	}
	
	
}
