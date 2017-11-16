package com.demo.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackageClasses = FileDownloadController.class)
public class FileDownloadControllerAdvice
{

  @ExceptionHandler({Exception.class})
  @ResponseBody
  ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
    ErrorMessage errorMessage = new ErrorMessage();
    errorMessage.setId(2);
    errorMessage.setMessage("Test message");
    return ResponseEntity.badRequest().body(errorMessage);
  }

}