package com.cgi.modularite.poc.core.data.mappers;

import java.time.LocalDateTime;

import org.springframework.security.core.context.SecurityContextHolder;

import com.cgi.modularite.poc.core.data.dtos.DTOWithSystemValues;
import com.cgi.modularite.poc.core.utils.DateUtils;

public class CommonMapper {

	private final DateUtils dateUtils;

	public CommonMapper(DateUtils dateUtils) {
		super();
		this.dateUtils = dateUtils;
	}

	public <D extends DTOWithSystemValues> D initialiseSystemValuesCreation(D dto) {
		final String principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		final LocalDateTime now = this.dateUtils.getLocalDateTimeNow();
		dto.setCreaDate(now);
		dto.setUpdateDate(now);
		dto.setUserUpd(principal);
		dto.setUserCrea(principal);

		return dto;
	}

	public <D extends DTOWithSystemValues> D initialiseSystemValuesUpdate(D dto) {
		final String principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		final LocalDateTime now = this.dateUtils.getLocalDateTimeNow();
		dto.setUpdateDate(now);
		dto.setUserUpd(principal);
		return dto;
	}
}
