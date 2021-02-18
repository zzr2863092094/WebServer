package com.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 负责与指定客户端进行HTTP交互
 * HTTP协议要与客户端的交互规则采取一问一答的方式。因此，处理客户端交互以3步形式完成：
 * 1：解析请求（一问）
 * 2：处理请求
 * 3：发送响应（一答）
 *
 */
public class ClientHandler implements Runnable{
    private Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }
    public void run() {
        try{
            //1解析请求
            InputStream in = socket.getInputStream();
            //测试读取客户端发送过来的请求内容
            int d;
            while ((d = in.read())!=-1){
                char c = (char)d;
                System.out.print(c);
            }


            //2处理请求

            //3发送响应

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //处理完毕后与客户端断开连接
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

