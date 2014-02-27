print("yay");

get("/", \-> demo.HelloWorld.renderToString() )

get("/foo", \-> "foo!" )

get("/bar", \-> "bar!" )