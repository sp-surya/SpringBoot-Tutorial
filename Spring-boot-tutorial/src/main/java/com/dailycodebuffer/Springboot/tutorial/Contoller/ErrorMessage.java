package com.dailycodebuffer.Springboot.tutorial.Contoller;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
	
  public HttpStatus status;
  private String message;
public HttpStatus getStatus() {
	return status;
}
public void setStatus(HttpStatus status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "ErrorMessage [status=" + status + ", message=" + message + "]";
}
public ErrorMessage() {
	super();
	// TODO Auto-generated constructor stub
}
public ErrorMessage(HttpStatus status, String message) {
	super();
	this.status = status;
	this.message = message;
}
  
  
}
