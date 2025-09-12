package models;

import java.util.ArrayList;

import controllers.CarpinteiroDashboardController;
import controllers.ClienteDashBoardController;
import controllers.IndexController;
import controllers.LoginController;
import controllers.SignupController;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App {

    public static ArrayList<User> usuarios = new ArrayList<>();
    public static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public/Views", Location.CLASSPATH);
        }).start(7000);

        IndexController indexController = new IndexController();
        LoginController loginController = new LoginController();
        SignupController signupController = new SignupController();
        CarpinteiroDashboardController carpinteiroDashboardController = new CarpinteiroDashboardController();
        ClienteDashBoardController clientedashboardcontroller = new ClienteDashBoardController();

        configureRoutes(app, indexController, loginController, signupController, carpinteiroDashboardController, clientedashboardcontroller);
    }

    private static void configureRoutes(Javalin app, IndexController indexController, LoginController loginController,
            SignupController signupController, CarpinteiroDashboardController carpinteiroDashboardController, ClienteDashBoardController clientedashboardcontroller) {
        app.get("/index", indexController.get);
        app.get("/login", loginController.get);
        app.get("/signup", signupController.get);
        app.get("/carpinteiro_Dashboard", carpinteiroDashboardController.get);
        app.get("/cliente_Dashboard", clientedashboardcontroller.get);

        app.post("/login", loginController.postLogin);

        app.before("/carpinteiro_Dashboard", ctx -> {
            if (ctx.sessionAttribute("user") == null) {
                ctx.redirect("/login");
            }
        });
    }
}
