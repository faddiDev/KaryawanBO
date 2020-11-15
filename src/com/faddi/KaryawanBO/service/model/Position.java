package com.faddi.KaryawanBO.service.model;

import java.io.Serializable;
import java.util.Set;

public class Position implements Serializable {

	private static final long serialVersionUID = 2256994432208926628L;
	
	private int id;
	private String code;
	private String name;
	private int isDelete;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
}
