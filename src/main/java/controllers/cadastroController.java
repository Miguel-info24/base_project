package controllers;

import io.javalin.http.Handler;

public class cadastroController {

    public Handler get = ctx -> {
        ctx.redirect("cadastro.html");
    };
}