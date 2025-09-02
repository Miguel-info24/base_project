package models;

import controllers.*;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import java.util.ArrayList;

public class App {

    public static ArrayList<User> usuarios = new ArrayList<>();
    public static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);

        // Controllers
        IndexController indexController = new IndexController();
        LoginController loginController = new LoginController();
        SignupController signupController = new SignupController();
        CarpinteiroDashboardController carpinteiroDashboardController = new CarpinteiroDashboardController();

        // Rotas GET
        app.get("/index", indexController.get);
        app.get("/login", loginController.get);
        app.get("/signup", signupController.get);
        app.get("/carpinteiro_DashBoard", carpinteiroDashboardController.get);

        // Rotas POST
        app.post("/login", loginController.post);

        // Proteção de rota do dashboard
        app.before("/carpinteiro_Dashboard", ctx -> {
            if (ctx.sessionAttribute("user") == null) {
                ctx.redirect("/login");
            }
        });
    }
}
