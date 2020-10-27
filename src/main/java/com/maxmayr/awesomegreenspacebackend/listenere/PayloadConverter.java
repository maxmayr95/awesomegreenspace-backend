package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.stereotype.Service;

@Service
public class PayloadConverter {
	public PayloadEntity toEntity(PayloadDto model) {
		PayloadEntity entity = new PayloadEntity();
		entity.setBattery(model.getBattery());
		entity.setEvent(model.getEvent());
		entity.setLight(model.getLight());
		entity.setTemperature(model.getTemperature());
		return entity;
	}
	
	public PayloadDto toModel(PayloadEntity entity) {
		PayloadDto model = new PayloadDto();
		model.setBattery(entity.getBattery());
		model.setEvent(entity.getEvent());
		model.setLight(entity.getLight());
		model.setTemperature(entity.getTemperature());
		return model;
	}
}
