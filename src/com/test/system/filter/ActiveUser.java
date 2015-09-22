package com.test.system.filter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;


public class ActiveUser {
	private static ActiveUser instance = new ActiveUser();
	private static Map<String, HttpSession> userLogin = new ConcurrentHashMap<String, HttpSession>();  /* ���ߵ��û� */
	public static ActiveUser getInstance() { 
		return instance;
	}
	
	public boolean exist(String userId) {
		return userLogin.keySet().contains(userId);
	}
	/**
	 * ��ӻ�û�
	 * @param userId �û���¼�˺�
	 * @param userSession
	 */
	public void addSingleLoginUser(String userId, HttpSession userSession) {
		userLogin.put(userId, userSession);
	}

	/**
	 * ��ȡ�û���ǰsession
	 * @param userId �û���¼�˺�
	 * @return
	 */
	public HttpSession getSingleLoginUserSession(String userId) {
		return userLogin.get(userId);
	}

	/**
	 * ɾ���û�
	 * @param userId �û���¼�˺�
	 */
	public void removeLonginUserByUid(String userId) {
		if (userLogin.containsKey(userId)) {
			userLogin.remove(userId);
		}
	}
	/**
	 * ���sessionɾ���û�
	 * @param sessionId
	 */
	public void removeLonginUserBySid(String sessionId) {
		Iterator it = userLogin.keySet().iterator();
		while (it.hasNext()) {
			Object key = it.next();
			HttpSession session = userLogin.get(key);
			if (sessionId.equals(session.getId())) {
				userLogin.remove(key);
			}
		}
	}
	/**
	 * ��ȡ��ǰ��������
	 * @return
	 */
	public int getOnlineUser(){
		return userLogin.size();
	}
}
