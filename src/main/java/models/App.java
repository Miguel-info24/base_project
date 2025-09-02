package models;

import controllers.IndexController;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App {

    

    public static void main( String[] args ){
        Javalin app = Javalin.create(config ->{
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);
        IndexController indexController = new IndexController();
        app.get("/index", indexController.get);
    }
}
