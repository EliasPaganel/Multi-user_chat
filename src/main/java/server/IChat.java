package server;

public interface IChat {
    void sendMessage(String message, User user);
    void setAdmin(User admin);
    void addUser(User user);
}
