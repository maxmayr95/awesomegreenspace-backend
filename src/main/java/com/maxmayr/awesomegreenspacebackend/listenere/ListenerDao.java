package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListenerDao {
	@Autowired
	ListenerRepository listenerRepository;
	public DeviceEntity createEntity(DeviceEntity entity) {
		return listenerRepository.save(entity);
	}
	public Boolean existDeviceForApplication(String appId, String devId) {
		Long count = listenerRepository.countAllByAppIdAndDevId(appId,devId);
		return (count>0);
	}
	public DeviceEntity getDeviceByAppIdAndDeviceId(String appId, String devId) {
		return listenerRepository.findAllByAppIdAndDevId(appId,devId);
	}

}
