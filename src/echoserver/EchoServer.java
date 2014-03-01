package echoserver;

import java.io.IOException;
import java.net.ServerSocket;

public class EchoServer {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        while (true) {
            new EchoThread(ss.accept()).start();
        }
    }
}
