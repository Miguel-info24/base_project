package controllers;
import io.javalin.http.Handler;

public class LoginController {
    public Handler get = ctx -> {
        ctx.redirect("login.html");
    };

    public Handler post = ctx -> {
        String email = ctx.formParam("email");
        String senha = ctx.formParam("senha");

        // Aqui você verificaria no "banco" (por enquanto pode ser uma lista mock)
        //if(email.equals("migsvannucci@gmail.com") && senha.equals("12e4s678.")){
            ctx.redirect("carpinteiro_Dashboard.html");
        //} else {
        //    ctx.status(401).result("Login inválido");
        //}
    };
}
