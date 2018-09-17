package workWithNetwork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 * Класс соединение, который инкапсулирует в себе работу с TCP-сокетами*/
public class TCPConnection implements IConnection{

    private Socket socket;

    public TCPConnection(Socket socket) {
        this.socket = socket;
    }

    public InputStream getInputStream() throws IOException {
        return socket.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        return socket.getOutputStream();
    }

    public int getTimeOut() {
        int timeout = -1;
        try {
            timeout = socket.getSoTimeout();
        } catch (SocketException e) {
            e.printStackTrace();//писать в логер
        }
        return timeout;
    }

    public void setTimeOut(int timeOut) {
        try {
            socket.setSoTimeout(timeOut);
        } catch (SocketException e) {
            e.printStackTrace();//писать в логер
        }
    }

    public void close() throws IOException {
        socket.close();
    }
}
