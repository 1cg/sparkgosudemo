package com.guidewire

uses spark.*
uses java.lang.*

class SparkGosu {

  construct(args : String[]){
      var port = System.getenv("PORT");
      if (port != null) {
        Spark.setPort(Integer.parseInt(port))
      }
      Spark.get(new Route("/hello") {
         function handle(request: Request, response: Response) : String {
            return HelloWorld.renderToString();
         }
      })
  }

}
