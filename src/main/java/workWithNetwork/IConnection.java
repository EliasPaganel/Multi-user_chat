package workWithNetwork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

public interface IConnection {
    InputStream getInputStream() throws IOException;
    OutputStream getOutputStream() throws IOException;
    int getTimeOut();
    void setTimeOut(int timeOut);
    void close() throws IOException;
}
