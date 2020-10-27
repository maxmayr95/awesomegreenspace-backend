package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "apps/{appId}/devices/{deviceId}")
public class PayloadController {

	@Autowired
	DeviceService deviceService; 
	@GetMapping("")
	public ResponseEntity<Page<PayloadDto>> createListener(@RequestParam(value = "page", defaultValue = "1") int page,@PathVariable("appId") String appId,@PathVariable("deviceId") String deviceId) {
		return new ResponseEntity<Page<PayloadDto>>(deviceService.getPayload(appId,deviceId,page), HttpStatus.OK);
	}
}
