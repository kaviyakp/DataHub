package org.test.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends BaseClass {
public LoginPOJOClass() {
	PageFactory.initElements(driver, this);
}
@findBy(id="email")
private WebElement username;
@findBy(id="pass")
private WebElement password;
@findBy(id="loginbutton")
private WebElement button;

public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getButton() {
	return button;
}
}
