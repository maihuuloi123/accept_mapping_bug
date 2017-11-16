package com.demo.test;

import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController
{

  @RequestMapping(value = "/download", method = RequestMethod.GET, produces = { MediaType.APPLICATION_OCTET_STREAM_VALUE, MediaType.APPLICATION_JSON_VALUE})
  public Resource getPaymentAttachment() throws java.io.FileNotFoundException, FileNotFoundException {
    if(1==1){
      throw new FileNotFoundException("Test Exception!!!");
    }
    return null;
  }
}
