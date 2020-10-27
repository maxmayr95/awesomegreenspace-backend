package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {
	
	@Autowired
	DeviceConverter deviceConverter;
	
	@Autowired
	ListenerDao listenerDao;

	public DeviceDto createEntry(DeviceDto devicePayload) {
		System.out.println("Battery:"+devicePayload.getPayloadFiels().getBattery());
		DeviceEntity returnEntity;
		Boolean existDevice = existDeviceForApplication(devicePayload.getAppId(), devicePayload.getDevId());
		if(existDevice) {
			returnEntity = listenerDao.getDeviceByAppIdAndDeviceId(devicePayload.getAppId(),devicePayload.getDevId());
		}else {
			DeviceEntity entity = deviceConverter.toEntity(devicePayload);
			returnEntity = listenerDao.createEntity(entity);
		}	
		return deviceConverter.toModel(returnEntity);
	}
	
	private Boolean existDeviceForApplication(String appId,String devId) {	
		return listenerDao.existDeviceForApplication(appId,devId);
	}

}
