package controllers;

import io.javalin.http.Handler;

public class CarpinteiroDashboardController {
    public Handler get = ctx -> {
        ctx.redirect("carpinteiro_DashBoard.html");
    };
}
