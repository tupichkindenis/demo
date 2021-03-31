package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Some java doc.
 *
 */
@SpringBootApplication
public class DemoApplication {

  @Override
  public boolean equals(Object obj) {
    return true;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
