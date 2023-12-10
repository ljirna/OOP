package Week10.Lab;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(1)
    public void sendMessage(User user){
        System.out.println("Regular user (" + user.username() +") " + "is restricted.");
    }

    @CanSendMessage
    @RequiresPermission(2)
    public void sendMessage (Admin admin, String message){
        System.out.println(admin.getUsername() + "sent a message: " + message);
    }

}
class Main {
    public static void main(String[] args){
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new User("Mirna");
        messagingSystem.sendMessage(regularUser);

        Admin admin = new Admin("Admin");
        messagingSystem.sendMessage(admin, "We need to talk.");

    }
}