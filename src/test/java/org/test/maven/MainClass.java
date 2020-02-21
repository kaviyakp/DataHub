package org.test.maven;

public class MainClass extends BaseClass{
public static void main(String[] args) {
	browserLaunch();
	loadURL("https://www.facebook.com");
	LoginPOJOClass l = new LoginPOJOClass();
	fill (l.getUsername(),"kaviya");
	fill (l.getPassword(),"Kaviya1234");
	click (l.getButton());
	
}
}
