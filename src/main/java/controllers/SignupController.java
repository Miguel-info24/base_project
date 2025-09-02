package controllers;

import io.javalin.http.Handler;
import models.*;

public class SignupController {

    // Abre a página de cadastro
    public Handler get = ctx -> {
        ctx.redirect("cadastro.html");
    };

    // Processa o cadastro (POST)
    public Handler post = ctx -> {
        String name = ctx.formParam("name");
        String email = ctx.formParam("email");
        String password = ctx.formParam("password");
        String cpf = ctx.formParam("cpf");
        String phone = ctx.formParam("phone");
        String tipoUsuario = ctx.formParam("tipo");

        User novo;
        if ("carpinteiro".equalsIgnoreCase(tipoUsuario)) {
            novo = new Carpinteiro(name, email, password, cpf, phone);
        } else {
            novo = new Client(name, email, password, cpf, phone);
        }

        App.usuarios.add(novo); 

        ctx.redirect("/login"); 
    };
}
