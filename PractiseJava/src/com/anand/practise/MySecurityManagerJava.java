package com.anand.practise;

import java.security.Permission;

public class MySecurityManagerJava extends SecurityManager {

	@Override
	public void checkPermission(Permission permission) {
		super.checkPermission(permission);
		if (permission.getName().contains("exitVM")) {
			System.out.println("Hello exiting ...");
		}
	}
}
