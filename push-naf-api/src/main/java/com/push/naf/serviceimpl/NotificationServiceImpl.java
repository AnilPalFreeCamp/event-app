package com.push.naf.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.push.naf.model.Notification;
import com.push.naf.service.NafService;

@Service
public class NotificationServiceImpl implements NafService {

	private static final Logger logger = LoggerFactory.getLogger(NotificationServiceImpl.class);

	@Override
	public boolean sendPushNotification(Notification notification) {
		try {
			logger.info("push notfication sent with details " + notification);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			throw ex;
		}
	}

	@Override
	public boolean sendAlertNotification(Notification notification) {
		try {
			logger.info("alert notfication sent with details " + notification);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			throw ex;
		}
	}

}
