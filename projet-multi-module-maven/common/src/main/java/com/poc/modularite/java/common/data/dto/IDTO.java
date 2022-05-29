package com.poc.modularite.java.common.data.dto;

import java.io.Serializable;

public interface IDTO<M, D> extends Serializable{

	public M convertToModelWithoutChildTable();
	
	public M convertToModelWithChildTable();
	
	public D modelToDTOWithoutChildTable(M model);
	
	public D modelToDTOWithChildTable(M model);

}
