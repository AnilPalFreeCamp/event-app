package com.push.naf.service;

import com.push.naf.model.Notification;

/**
 * 
 * @author anil
 *
 */
public interface NafService {
	/**
	 * Notification service : which sends push notification to a user
	 * 
	 * @return
	 */
	boolean sendPushNotification(Notification notification);

	/**
	 * Sends alert to Operation team
	 * 
	 * @return
	 */
	boolean sendAlertNotification(Notification notification);
}
