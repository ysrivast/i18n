package com.example.demo;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  
  @Autowired
  private MessageSource messageSource;
  
  @GetMapping("/")
  public String home(Locale locale) {
    System.err.println(locale.getCountry() );
    System.err.println(locale.getLanguage() );
    return messageSource.getMessage("message", null, locale);
    
  }

}
