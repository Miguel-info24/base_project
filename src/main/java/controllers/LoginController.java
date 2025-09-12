package controllers;

import io.javalin.http.Handler;

public class LoginController {

    public Handler get = ctx -> {
        ctx.redirect("login.html");
    };

    public Handler postLogin = ctx -> {
        String userType = ctx.formParam("userType");

        if ("cliente".equals(userType)) {
            ctx.redirect("cliente_Dashboard.html");
        } else if ("carpinteiro".equals(userType)) {
            ctx.redirect("carpinteiro_Dashboard.html");
        } else {
            ctx.status(400).result("Tipo de usuário inválido");
        }
    };
}
