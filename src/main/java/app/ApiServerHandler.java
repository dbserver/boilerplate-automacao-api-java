package app;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.sun.net.httpserver.HttpExchange;

public class ApiServerHandler extends BaseHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String apiPath = exchange
                .getRequestURI()
                .getPath()
                .replaceFirst("/$", "");

        String recurso = obterRecurso(exchange.getRequestMethod(), apiPath);

        exchange.getResponseHeaders()
                .set("Content-Type", "application/json; charset=UTF-8");

        byte[] conteudo = Files.readAllBytes(Paths.get(recurso));

        exchange.sendResponseHeaders(200, conteudo.length);

        try (OutputStream stream = exchange.getResponseBody()) {
            stream.write(conteudo);

            stream.flush();
        }
    }

    private String obterRecurso(String metodo, String path) {
        String diretorioRecursos = ApiServerHandler.DiretorioResourcesApp.concat(File.separator);

        String recurso;

        if (path.equals("/api")) {
            recurso = diretorioRecursos
                    .concat(path.replace("/", File.separator))
                    .concat(File.separator)
                    .concat("health-check")
                    .concat(File.separator)
                    .concat("GET.json");

            return recurso;
        }

        recurso = diretorioRecursos
                .concat(path.replace("/", File.separator))
                .concat(File.separator)
                .concat(String.format("%s.json", metodo));

        return recurso;
    }
}
