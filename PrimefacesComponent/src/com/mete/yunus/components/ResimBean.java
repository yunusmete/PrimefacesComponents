package com.mete.yunus.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ResimBean {
	
	private String yol = "./images/logo.png";
	
	public String getYol(){
		return yol;
	}
}
