package server;

import java.util.ArrayList;
import java.util.List;

public class ChatImpl implements IChat {

    private User admin;
    private List<User> users;
    private List<Message> messages;

    public ChatImpl() {
        users = new ArrayList<User>();
        messages = new ArrayList<Message>();
    }

    public void setAdmin(User admin) {
        if(admin != null && admin instanceof Administrator)
            this.admin = admin;
        else
            throw new RuntimeException("Не хватает прав");

    }

    public void addUser(User user) {
        if(admin == null)
            throw new RuntimeException("В чате нет админа");
        if(user != null && user instanceof SimpleUser)
            this.users.add(user);
        else
            throw new RuntimeException("Необходимо ввести простого пользователя");
    }

    public void sendMessage(String message, User user) {
        if(user instanceof Administrator){
            for (User u : users) {
                u.getMessage(user.getName() + " \"" + message + " \"");
            }
        }
        else if(user instanceof SimpleUser){
            for (User u: users){
                if(user != u)
                    u.getMessage(user.getName() + " \"" + message + " \"");
            }
            admin.getMessage(user.getName() + " \"" + message + " \"");
        }
    }
}
