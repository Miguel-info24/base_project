package routes;

import controllers.CarpinteiroDashboardController;
import controllers.ClienteDashboardController;
import controllers.IndexController;
import controllers.LoginController;
import controllers.SignupController;
import io.javalin.Javalin;

public class Rotas {

    private CarpinteiroDashboardController carpinteiroDashboardController;
    private IndexController indexController;
    private LoginController loginController;
    private SignupController signupController;
    private ClienteDashboardController clienteController;

    public Rotas() {
        this.carpinteiroDashboardController = new CarpinteiroDashboardController();
        this.loginController = new LoginController();
        this.signupController = new SignupController();
        this.clienteController = new ClienteDashboardController();
        this.indexController = new IndexController();
    }

    public void registraRotas(Javalin app) {
        app.get("/", indexController.get);
        app.get("/cadastro", carpinteiroDashboardController.get);
        app.get("/login", loginController.get);
        app.post("/login", loginController.post);
        app.get("/signup", signupController.get);
        app.post("/signup", signupController.post);
        app.get("/cliente_Dashboard", clienteController.get);
        app.get("/cliente_Dashboard/fazerPedido", clienteController.fazerPedido);
        app.get("/cliente_Dashboard/cancelarPedido", clienteController.cancelarPedido);

    }
}
