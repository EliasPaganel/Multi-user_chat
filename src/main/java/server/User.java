package server;

public abstract class User {
    IChat chat;
    String name;

    public User(IChat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        chat.sendMessage(message, this);
    }
    public abstract void getMessage(String message);
}
