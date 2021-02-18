package com.webserver.core;
import java.io.IOException;




import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer主类
 */
public class WebServer {
    private ServerSocket serverSocket;
    public WebServer(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            /*
                http://localhost:8088
                http://localhost:8088/index.html
             */
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了!");
            //启动一个线程与该客户端交互
            ClientHandler handler = new ClientHandler(socket);
            Thread t = new Thread(handler);
            t.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        WebServer server = new WebServer();
        server.start();
    }
}
