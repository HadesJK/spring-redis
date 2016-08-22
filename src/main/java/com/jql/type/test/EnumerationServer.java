package com.jql.type.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 10:54
 */


public class EnumerationServer {

    public static void main(String... args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(8999);
        // 建立服务器端的网络连接侦听
        Socket socket = server.accept();
        // 从连接中获取输入流
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        // 读出客户端传递来的枚举值
        WeekDayEnum day = (WeekDayEnum) ois.readObject();
        // 用值比较方式来对比枚举对象
        if (day == WeekDayEnum.Fri) {
            System.out.println("client Friday enum value is same as server's");
        }
        if (day.equals(WeekDayEnum.Fri)) {
            System.out.println("client Friday enum value is equal to server's");
        }


        // 用 switch 方式来比较枚举对象
        switch (day) {
            case Mon:
                System.out.println("Do Monday work");
                break;
            case Tue:
                System.out.println("Do Tuesday work");
                break;
            case Wed:
                System.out.println("Do Wednesday work");
                break;
            case Thu:
                System.out.println("Do Thursday work");
                break;
            case Fri:
                System.out.println("Do Friday work");
                break;
            case Sat:
                System.out.println("Do Saturday work");
                break;
            case Sun:
                System.out.println("Do Sunday work");
                break;
            default:
                System.out.println("I don't know which is day");
                break;
        }

        ois.close();
        is.close();
        socket.close();
    }
}
