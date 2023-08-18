package com.gravityScale.gravityScale.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gravityScale.gravityScale.RequestDto.UserRegistrationDto;
import com.gravityScale.gravityScale.model.ShopDetails;
import com.gravityScale.gravityScale.model.Users;
import com.gravityScale.gravityScale.model.Users.Role;
import com.gravityScale.gravityScale.repository.ShopDetailDAO;
import com.gravityScale.gravityScale.repository.UserDAO;
import com.gravityScale.gravityScale.responseDto.ResponseDto;
import com.gravityScale.gravityScale.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ShopDetailDAO shopDao;

	@Autowired
	private UserDAO userDao;

	@Override
	public ResponseEntity<ResponseDto> saveUser(UserRegistrationDto dto) {
		try {

			Users userObj = new Users();
			userObj.setUserName(dto.getUserName());
			userObj.setMobileNo(dto.getMobileNo());
			userObj.setRole(Role.SHOPOWNER);
			userObj.setStatus(true);
			userObj.setCreatedAt(LocalDateTime.now());
			userObj.setUpdatedAt(LocalDateTime.now());
			userDao.save(userObj);

			ShopDetails shopObj = new ShopDetails();
			shopObj.setUserDetails(userObj);
			shopObj.setShopName(dto.getShopName());
			shopObj.setShopNature(dto.getShopNature());
			shopObj.setShopAddress(dto.getShopAddress());
			shopObj.setStatus(true);
			shopDao.save(shopObj);

			ResponseDto responseDto = new ResponseDto();
			responseDto.setStatus(HttpStatus.OK.value());
			responseDto.setMessage("Data retrieved successfully");
			responseDto.setData(userObj);

			return ResponseEntity.ok(responseDto);

		} catch (Exception e) {
			ResponseDto errorResponse = new ResponseDto();
			errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setMessage("An error occurred");
			errorResponse.setError(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
		}
	}

}
