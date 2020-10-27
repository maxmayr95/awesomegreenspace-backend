package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenerRepository extends PagingAndSortingRepository<DeviceEntity, Long>{

	@Query(value = "SELECT COUNT(device) FROM DeviceEntity device WHERE device.appId = :appId AND device.devId = :devId")
	Long countAllByAppIdAndDevId(String appId, String devId);
	
	@Query(value = "SELECT device FROM DeviceEntity device WHERE device.appId = :appId AND device.devId = :devId")
	DeviceEntity findAllByAppIdAndDevId(String appId, String devId);

}
