/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notificationsyste;

/**
 *
 * @author user
 */
public class NotificationSyste {

  
    public static void main(String[] args) {
        Factory f=new EmailFactory();
       Notification n= f.createnotify();
       n.show();
       Factory f1=new PushFactory();
       Notification n1= f1.createnotify();
       n1.show();
       Factory f2=new Smsfactory();
       Notification n2= f2.createnotify();
       n2.show();
       
    }
    
}
