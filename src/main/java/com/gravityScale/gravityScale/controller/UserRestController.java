package com.gravityScale.gravityScale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gravityScale.gravityScale.RequestDto.UserRegistrationDto;
import com.gravityScale.gravityScale.responseDto.ResponseDto;
import com.gravityScale.gravityScale.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/save-user")
	public ResponseEntity<ResponseDto> registerUser(@RequestBody UserRegistrationDto dto){
		return service.saveUser(dto);
	}

}
