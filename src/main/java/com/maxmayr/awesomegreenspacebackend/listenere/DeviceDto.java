package com.maxmayr.awesomegreenspacebackend.listenere;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceDto {
	private Long id;
	@JsonProperty("dev_id")
	private String devId;
	@JsonProperty("app_id")
	private String appId;
	@JsonProperty("hardware_serial")
	private String hardwareSerial;
	@JsonProperty("payload_fields")
	private PayloadDto payloadFiels;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDevId() {
		return devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getHardwareSerial() {
		return hardwareSerial;
	}
	public void setHardwareSerial(String hardwareSerial) {
		this.hardwareSerial = hardwareSerial;
	}
	public PayloadDto getPayloadFiels() {
		return payloadFiels;
	}
	public void setPayloadFiels(PayloadDto payloadFiels) {
		this.payloadFiels = payloadFiels;
	}
	
}
