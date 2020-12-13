package com.stacksimplify.restservices.exceptions;

public class UserExistsException extends Exception {
  private static final long serialVersionUID = 190458548;

  public UserExistsException(String message) {
    super(message);
  }
}
