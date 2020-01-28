package com.push.naf.model;

import javax.validation.constraints.NotNull;

import com.push.naf.enums.NotificationType;

public class Notification {
	@NotNull
	private String userId;
	@NotNull
	private String tokenId;
	@NotNull
	private String payload;
	@NotNull
	private NotificationType notificationType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	@Override
	public String toString() {
		return "Notification [userId=" + userId + ", tokenId=" + tokenId + ", payload=" + payload
				+ ", notificationType=" + notificationType + "]";
	}

}
