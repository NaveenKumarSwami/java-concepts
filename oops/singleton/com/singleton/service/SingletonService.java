package com.singleton.service;

public class SingletonService {
	private static SingletonService singletonSericeInstance = null;

	private SingletonService() {
		System.out.println("Inside zero parameterized constractor");
	}

	public static SingletonService getSingletonService() {
		if (singletonSericeInstance == null) {
			singletonSericeInstance = new SingletonService();
		}
		return singletonSericeInstance;
	}

	public static SingletonService SingletonService() {
		if (singletonSericeInstance == null) {
			singletonSericeInstance = new SingletonService();
		}
		return singletonSericeInstance;
	}
}
