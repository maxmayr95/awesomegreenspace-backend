package com.maxmayr.awesomegreenspacebackend.listenere;

public class PayloadDto {
	private Long battery;
	private String event;
	private Long light;
	private Long temperature;
	private Long humidity;
	private Long eco2;
	private Long tvoc;
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
	public Long getTemperature() {
		return temperature;
	}
	public void setTemperature(Long temperature) {
		this.temperature = temperature;
	}
	public Long getHumidity() {
		return humidity;
	}
	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}
	public Long getEco2() {
		return eco2;
	}
	public void setEco2(Long eco2) {
		this.eco2 = eco2;
	}
	public Long getTvoc() {
		return tvoc;
	}
	public void setTvoc(Long tvoc) {
		this.tvoc = tvoc;
	}
}
