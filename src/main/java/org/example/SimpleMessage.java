package org.example;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class SimpleMessage implements HttpHandler{
    @Override
    public void handle(HttpExchange request) throws IOException {
        String answer = "HTTP Simple Server";

        request.sendResponseHeaders(200, answer.length());
        OutputStream body = request.getResponseBody();
        body.write(answer.getBytes());
        body.close();
    }
}
