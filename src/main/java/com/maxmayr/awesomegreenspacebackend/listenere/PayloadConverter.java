package com.maxmayr.awesomegreenspacebackend.listenere;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class PayloadConverter {
	public PayloadEntity toEntity(PayloadDto model) {
		PayloadEntity entity = new PayloadEntity();
		entity.setBattery(model.getBattery());
		entity.setEvent(model.getEvent());
		entity.setLight(model.getLight());
		entity.setTemperature(model.getTemperature());
		entity.setHumidity(model.getHumidity());
		entity.setEco2(model.getEco2());
		entity.setTvoc(model.getTvoc());
		entity.setTime(model.getTime());
		return entity;
	}
	
	public PayloadDto toModel(PayloadEntity entity) {
		PayloadDto model = new PayloadDto();
		model.setBattery(entity.getBattery());
		model.setEvent(entity.getEvent());
		model.setLight(entity.getLight());
		model.setTemperature(entity.getTemperature());
		model.setHumidity(entity.getHumidity());
		model.setEco2(entity.getEco2());
		model.setTvoc(entity.getTvoc());
		model.setTime(entity.getTime());
		return model;
	}
	
	public List<PayloadDto> toModel(List<PayloadEntity> entities) {
		List<PayloadDto> models = new ArrayList<>();
		for (PayloadEntity entity : entities) {
			models.add(toModel(entity));
		}
		return models;
	}

	public Page<PayloadDto> toModel(Page<PayloadEntity> entities) {
		if (entities == null) {
			return null;
		}
		return entities.map(this::toModel);
	}
}
