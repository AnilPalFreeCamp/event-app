package com.event.ingest.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Event {
	@Column(name = "noun")
	@NotNull
	String noun;
	@Column(name = "userId")
	@NotNull
	String userId;
	@Column(name = "ts")
	long ts;
	@Column(name = "latlong")
	String latlong;
	@Column(name = "verb")
	String verb;
	@Column(name = "timespent")
	long timespent;
	@Column(name = "is_feedback")
	boolean isFeedBackRecived;
	@Column(name = "is_naf_sent")
	boolean isNotificationSent;
	@Column(name = "properties")
	Map<String, String> properties;

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public String getLatlong() {
		return latlong;
	}

	public void setLatlong(String latlong) {
		this.latlong = latlong;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public long getTimespent() {
		return timespent;
	}

	public void setTimespent(long timespent) {
		this.timespent = timespent;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public boolean isFeedBackRecived() {
		return isFeedBackRecived;
	}

	public void setFeedBackRecived(boolean isFeedBackRecived) {
		this.isFeedBackRecived = isFeedBackRecived;
	}

	@Override
	public String toString() {
		return "Event [noun=" + noun + ", userId=" + userId + ", ts=" + ts + ", latlong=" + latlong + ", verb=" + verb
				+ ", timespent=" + timespent + ", properties=" + properties + "]";
	}
}
