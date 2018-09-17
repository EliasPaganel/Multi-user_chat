package workWithNetwork;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class ConnectionFactory {
    ServerSocket serverSocket;

    public ConnectionFactory(String host, int port) throws IOException {
        this.serverSocket = new ServerSocket(port, 0, InetAddress.getByName(host));
    }

    public IConnection getConnection() throws IOException {
        return new TCPConnection(serverSocket.accept());
    }
}
