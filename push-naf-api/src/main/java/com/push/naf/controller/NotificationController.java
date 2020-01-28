package com.push.naf.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naf.factory.NotificationFactory;
import com.push.naf.model.Notification;

@RestController("naf")
public class NotificationController {

	@Autowired
	NotificationFactory notificationFactory;

	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	private Validator validator = factory.getValidator();

	@PostMapping("/send")
	public ResponseEntity<Object> sendNotification(@RequestBody Notification notification) {
		try {
			Set<ConstraintViolation<Notification>> validatorErrorSet = validator.validate(notification);
			if (validatorErrorSet != null && !validatorErrorSet.isEmpty())
				return ResponseEntity.badRequest().build();
			notificationFactory.sendNotification(notification);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(String.class);
		}
	}
}
