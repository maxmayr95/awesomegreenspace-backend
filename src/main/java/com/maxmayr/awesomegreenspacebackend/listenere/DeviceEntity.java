package com.maxmayr.awesomegreenspacebackend.listenere;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="device")
public class DeviceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "dev_id")
	private String devId;
	@Column(name = "app_id")
	private String appId;
	@Column(name = "hardware_serial")
	private String hardwareSerial;
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
}
