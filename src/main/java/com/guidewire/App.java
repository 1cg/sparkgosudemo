package com.guidewire;

import static spark.Spark.*;
import spark.*;

public class App
{
    public static void main( String[] args )
    {
      setPort(Integer.parseInt(System.getenv("PORT")));
      get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });
    }
}
