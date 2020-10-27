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
