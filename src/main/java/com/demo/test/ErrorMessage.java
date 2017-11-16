package com.demo.test;

public class ErrorMessage
{
  private int id;
  private String message;

  public int getId() {
    return id;
  }

  public ErrorMessage setId(int id) {
    this.id = id;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ErrorMessage setMessage(String message) {
    this.message = message;
    return this;
  }
}
