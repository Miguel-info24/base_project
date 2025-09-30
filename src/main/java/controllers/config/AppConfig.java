package controllers.config;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinFreemarker;
import models.App;

public class AppConfig {

    public Javalin iniciaApp() {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_0);
        cfg.setClassForTemplateLoading(App.class, "/Views");
        cfg.setDefaultEncoding("UTF-8");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/", Location.CLASSPATH);

            config.fileRenderer(new JavalinFreemarker(cfg));
        }).start(7000);

        return app;
    }
}
