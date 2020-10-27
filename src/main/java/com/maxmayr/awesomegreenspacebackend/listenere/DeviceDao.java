package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DeviceDao {
	@Autowired
	DeviceRepository deviceRepository;
	@Autowired
	PayloadRepository payloadRepository;

	public DeviceEntity createEntity(DeviceEntity entity) {
		return deviceRepository.save(entity);
	}

	public Boolean existDeviceForApplication(String appId, String devId) {
		Long count = deviceRepository.countAllByAppIdAndDevId(appId, devId);
		return (count > 0);
	}

	public DeviceEntity getDeviceByAppIdAndDeviceId(String appId, String devId) {
		return deviceRepository.findAllByAppIdAndDevId(appId, devId);
	}

	public PayloadEntity createPayload(PayloadEntity entity) {
		return payloadRepository.save(entity);
	}

	public Page<PayloadEntity> getPayload(Long deviceId,PageRequest pageable) {
		return payloadRepository.findAllByDeviceId(deviceId,pageable);
	}

}
