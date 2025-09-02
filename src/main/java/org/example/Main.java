package org.example;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        InetSocketAddress door = new InetSocketAddress (8003);

        // Create server
        HttpServer server= HttpServer.create(door, 0);

        // Create services
        server.createContext("/SimpleMessage", new SimpleMessage());

        // Turn on server
        server.setExecutor(null);
        server.start();
        System.out.println("Web server HTTP on ar:\n htpp://localhost:8000/SimpleMessage");
    }
}