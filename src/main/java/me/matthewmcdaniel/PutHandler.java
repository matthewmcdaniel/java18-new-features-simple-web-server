package me.matthewmcdaniel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class PutHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.setAttribute("Handler Type:", "PUT");
        exchange.sendResponseHeaders(200, 0);
        OutputStream os = exchange.getResponseBody();
        os.write("<html><head></head><body><h1>Hello, you have invoked the put handler!</h1></body></html>".getBytes());
        exchange.getRequestHeaders().forEach((k,v) -> {
            String str = "<p>Header key: " + k + "; " + "Header value: " + v + "</p>";
            try {
                os.write(str.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        os.close();

    }

}
