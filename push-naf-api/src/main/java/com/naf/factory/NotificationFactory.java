package com.naf.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.push.naf.model.Notification;
import com.push.naf.service.NafService;

@Component
public class NotificationFactory {

	@Autowired
	NafService nafService;

	public boolean sendNotification(Notification notification) {
		switch (notification.getNotificationType()) {
		case PUSH_NOTIFICATION:
			return nafService.sendPushNotification(notification);
		case OPERATION_NOTIFICATION:
			return nafService.sendAlertNotification(notification);
		default:
			throw new RuntimeException("not implemented");
		}
	}
}
