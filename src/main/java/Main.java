import server.*;

import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        IChat textChat = new ChatImpl();

        User admin = new Administrator(textChat, "Борис Николаевич");
        User user1 = new SimpleUser(textChat, "Алена");
        User user2 = new SimpleUser(textChat,"Елена");
        User user3 = new SimpleUser(textChat, "Никифор");

        textChat.setAdmin(admin);
        textChat.addUser(user1);
        textChat.addUser(user2);
        textChat.addUser(user3);

        user1.sendMessage("йо йо йопт");

        try{
            Socket s = new Socket("localhost", 3128);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
