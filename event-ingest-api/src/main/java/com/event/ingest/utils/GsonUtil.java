package com.event.ingest.utils;

import com.google.gson.Gson;

public class GsonUtil {

	private static Gson gson = new Gson();

	public static <T> String convertObjectToStr(T t) {
		return gson.toJson(t);
	}

	public static <T> T convertStrToObject(Class<T> classOf, String str) {
		return gson.fromJson(str, classOf);
	}

}
