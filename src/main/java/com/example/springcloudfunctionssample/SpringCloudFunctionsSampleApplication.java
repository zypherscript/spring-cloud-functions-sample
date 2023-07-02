package com.example.springcloudfunctionssample;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionsSampleApplication {

  /*
  SpringBootRequestHandler is now Deprecated
  Use this: org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest
   */

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudFunctionsSampleApplication.class, args);
  }

  @Bean
  public Function<String, String> reverseString() {
    return value -> new StringBuilder(value).reverse().toString();
  }
}

class Greeter implements Function<String, String> {

  @Override
  public String apply(String s) {
    return "Hello " + s + ", and welcome to Spring Cloud Function!!!";
  }
}