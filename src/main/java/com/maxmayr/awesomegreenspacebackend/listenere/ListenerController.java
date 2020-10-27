package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "listener")
public class ListenerController {

	@Autowired
	ListenerService listenerService;
	
	@PostMapping("")
	public ResponseEntity<?> createListener(@RequestBody DeviceDto devicePayload) {
		return new ResponseEntity<DeviceDto>(listenerService.createEntry(devicePayload), HttpStatus.OK);
	}
}
