package com.hongzhaoyang.learn.common;


/**
 * 一个threadlocal定义
 * @author hongzhaoyang
 *
 */
public abstract class UserUtils {
	
	private static ThreadLocal<String> currentUid = new ThreadLocal<String>();
	
	public static final String USER_KEY="user_key";
	public static final String DEFAULT_UID="system";

	public static String getCurrentUid() {
		String uid = currentUid.get();
		if (uid == null) {
			uid = DEFAULT_UID;
		}
		return uid;
	}
	public static void setCurrentUid(String uid) {
		currentUid.set(uid);
	}
	
	
}
