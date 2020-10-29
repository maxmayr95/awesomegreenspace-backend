package com.maxmayr.awesomegreenspacebackend.listenere;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payload")
public class PayloadEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "device_id")
	private Long deviceId;
	@Column(name = "battery")
	private Long battery;
	@Column(name = "event")
	private String event;
	@Column(name = "light")
	private Long light;
	@Column(name = "temperature")
	private Float temperature;
	@Column(name = "humidity")
	private Float humidity;
	@Column(name = "eco2")
	private Float eco2;
	@Column(name = "tvoc")
	private Float tvoc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
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
	
	
}
