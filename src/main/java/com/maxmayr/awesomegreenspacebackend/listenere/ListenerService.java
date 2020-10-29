package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {
	
	@Autowired
	DeviceConverter deviceConverter;
	
	@Autowired
	PayloadConverter payloadConverter;
	
	@Autowired
	DeviceDao deviceDao;

	public DeviceDto createEntry(DeviceDto devicePayload) {
		System.out.println("Battery:"+devicePayload.getPayloadFiels().getBattery());
		DeviceEntity returnEntity;
		Boolean existDevice = existDeviceForApplication(devicePayload.getAppId(), devicePayload.getDevId());
		if(existDevice) {
			returnEntity = deviceDao.getDeviceByAppIdAndDeviceId(devicePayload.getAppId(),devicePayload.getDevId());
		}else {
			DeviceEntity entity = deviceConverter.toEntity(devicePayload);
			returnEntity = deviceDao.createEntity(entity);
		}
		
		insertPayload(returnEntity.getId(),devicePayload.getPayloadFiels());
		
		return deviceConverter.toModel(returnEntity);
	}
	private PayloadDto insertPayload(Long deviceId,PayloadDto payload) {
		
		PayloadEntity entity = payloadConverter.toEntity(payload);
		entity.setDeviceId(deviceId);
		PayloadEntity returnEntity = deviceDao.createPayload(entity);
		return payloadConverter.toModel(returnEntity);
	}
	
	private Boolean existDeviceForApplication(String appId,String devId) {	
		return deviceDao.existDeviceForApplication(appId,devId);
	}

}
