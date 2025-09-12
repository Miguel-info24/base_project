package controllers;

import io.javalin.http.Handler;

public class ClienteDashBoardController {
    public Handler get = ctx ->{
        ctx.redirect("cliente_dashBoard.html");
    };
}
