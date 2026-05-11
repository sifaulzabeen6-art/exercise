/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificationsyste;

/**
 *
 * @author user
 */
public class Smsfactory  extends Factory{

    @Override
    Notification createnotify() {
       return new Smsnotification();
    }
    
}
