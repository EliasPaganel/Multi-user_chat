package server;

public class SimpleUser extends User {

    public SimpleUser(IChat chat, String name) {
        super(chat, name);
    }

    public void getMessage(String message) {
        System.out.println("Пользователь "+ getName() +" получил сообщение: " + message);
    }
}
