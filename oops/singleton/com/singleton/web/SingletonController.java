package com.singleton.web;

import com.singleton.service.SingletonService;

public class SingletonController {
	// want to acces singleton class
	SingletonService singletonClass = SingletonService.getSingletonService();
}
