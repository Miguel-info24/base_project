package controllers;

import io.javalin.http.Handler;

public class CarpinteiroDashboardController {
    public Handler get = ctx -> {
        ctx.render("carpinteiro_Dashboard.ftl");
    };
}
