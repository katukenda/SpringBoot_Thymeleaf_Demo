package com.katukenda.loginregistration.service;

import com.katukenda.loginregistration.model.User;
import com.katukenda.loginregistration.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
}
