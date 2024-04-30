package com.app.Exception;

public class StringLength {
  private String userString;

  public StringLength() {
	  
  }
  public StringLength(String userString) {
	  this.userString = userString;
  }
public String getUserString() {
	return userString;
}

public void setUserString(String userString) {
	this.userString = userString;
}
  
public void checkLength() {
  if(userString.length()>80) {
	  // throw except
	  throw new ExceptionLineTooLong("The String is Too Long");
  }
  else {
	  System.out.println("The Length of String is : "+ userString.length());
  }
}
}
