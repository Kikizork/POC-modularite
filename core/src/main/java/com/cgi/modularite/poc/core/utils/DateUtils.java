package com.cgi.modularite.poc.core.utils;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class DateUtils {

	public Clock clock = Clock.systemDefaultZone();

	public LocalDateTime getLocalDateTimeNow() {
		return LocalDateTime.now(this.clock);
	}

	public LocalDate getLocalDateNow() {
		return LocalDate.now(this.clock);
	}
}
