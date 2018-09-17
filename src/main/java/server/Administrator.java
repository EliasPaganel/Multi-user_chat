package server;

public class Administrator extends User {

    public Administrator(IChat chat, String name) {
        super(chat, name);
    }

    public void getMessage(String message) {
        System.out.println("Администратор " + getName() + " получил следующее сообщение: " + message);
    }
}
