package controllers;

import io.javalin.http.Handler;

public class ClienteDashboardController {

    public Handler get = ctx -> {
        ctx.render("cliente_dashBoard.ftl"); 
    };

    public Handler fazerPedido = ctx -> {
        ctx.render("cliente_fazerPedido.ftl");
    };

    public Handler cancelarPedido = ctx -> {
        ctx.render("cliente_cancelarPedido.ftl");
    };
}
