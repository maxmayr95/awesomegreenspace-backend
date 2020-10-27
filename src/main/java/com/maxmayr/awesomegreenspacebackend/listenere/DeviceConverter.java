package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceConverter {
	
	@Autowired
	PayloadConverter payloadConverter;

	public DeviceEntity toEntity(DeviceDto model) {
		DeviceEntity entity = new DeviceEntity();
		entity.setId(model.getId());
		entity.setAppId((model.getAppId()));
		entity.setDevId(model.getDevId());
		entity.setHardwareSerial(model.getHardwareSerial());
		//TODO: implement
		//payloadConverter.toEntity(model.getPayloadFiels());
		return entity;
	}
	
	public DeviceDto toModel(DeviceEntity entity) {
		DeviceDto model = new DeviceDto();
		model.setId(entity.getId());
		model.setAppId(entity.getAppId());
		model.setDevId(entity.getDevId());
		model.setHardwareSerial(entity.getHardwareSerial());
		// TODO:implement
		//payloadConverter.toModel(entity.getPayloadFiels());
		
		return model;
	}

}
