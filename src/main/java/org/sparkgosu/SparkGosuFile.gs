package org.sparkgosu

uses spark.*
uses java.lang.*

class SparkGosuFile {

  construct(){
    var port = System.getenv("PORT");
    if (port != null) {
      Spark.setPort(Integer.parseInt(port))
    }
  }

  function get(path : String, handler: block():String) {
    Spark.get(new Route(path) {
       function handle(request: Request, response: Response) : String {
          return handler();
       }
    })
  }

}
