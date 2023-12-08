package bergs.Cap.Capuaajm.main.java.app;

import java.io.File;
import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import bergs.Cap.Capuaajm.main.java.framework.utils.FileOperations;

public abstract class BaseHandler implements HttpHandler {
    protected static final String DiretorioResourcesApp = FileOperations.DiretorioResourcesAplicacao
            + File.separator + "app";

    @Override
    public abstract void handle(HttpExchange exchange) throws IOException;
}
