package controllers;

import io.javalin.http.Handler;

public class LoginController {

    public Handler get = ctx -> {
        ctx.render("login.ftl");
    };

    public Handler post = ctx -> {
        String userType = ctx.formParam("userType");

        if ("cliente".equals(userType)) {
            ctx.render("cliente_Dashboard.ftl");
        } else if ("carpinteiro".equals(userType)) {
            ctx.render("carpinteiro_Dashboard.ftl");
        } else {
            ctx.status(400).result("Tipo de usuário inválido");
        }
    };
}
