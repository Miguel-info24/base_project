package models;
import controllers.config.AppConfig;
import routes.Rotas;



public class App {

    public static void main(String[] args) {

        Rotas rotas = new Rotas();
        AppConfig appConfig = new AppConfig();

        rotas.registraRotas(appConfig.iniciaApp());

    }
}