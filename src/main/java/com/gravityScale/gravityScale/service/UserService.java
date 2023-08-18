package com.gravityScale.gravityScale.service;

import org.springframework.http.ResponseEntity;

import com.gravityScale.gravityScale.RequestDto.UserRegistrationDto;
import com.gravityScale.gravityScale.responseDto.ResponseDto;

public interface UserService {

	ResponseEntity<ResponseDto> saveUser(UserRegistrationDto dto);

}
