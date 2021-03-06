package com.maxmayr.awesomegreenspacebackend.listenere;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PayloadDto {
	private Long battery;
	private String event;
	private Long light;
	private Float temperature;
	private Float humidity;
	private Float eco2;
	private Float tvoc;
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date time;
	public Long getBattery() {
		return battery;
	}
	public void setBattery(Long battery) {
		this.battery = battery;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public Long getLight() {
		return light;
	}
	public void setLight(Long light) {
		this.light = light;
	}
	public Float getTemperature() {
		return temperature;
	}
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	public Float getHumidity() {
		return humidity;
	}
	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}
	public Float getEco2() {
		return eco2;
	}
	public void setEco2(Float eco2) {
		this.eco2 = eco2;
	}
	public Float getTvoc() {
		return tvoc;
	}
	public void setTvoc(Float tvoc) {
		this.tvoc = tvoc;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
