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
	private Long temperature;
	@Column(name = "humidity")
	private Long humidity;
	@Column(name = "eco2")
	private Long eco2;
	@Column(name = "tvoc")
	private Long tvoc;
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
