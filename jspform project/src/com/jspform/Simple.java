package com.jspform;

import java.io.Serializable;

public class Simple implements Serializable {
private String  username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getpassword() {
	return password;
}
public void setPassword(String pwd) {
	this.password = password;
}
}
