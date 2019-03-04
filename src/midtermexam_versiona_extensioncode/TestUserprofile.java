/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author zhengguoxing
 */
public class TestUserprofile {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("enter your user Id");
    String n = input.next();
    System.out.println("where you wants to create a new profile? eg.Comedy,Drama,Action,Mystery");
    String x = input.next();
    
    UserProfile u = new UserProfile(n,x);
   
    System.out.println("your userProfile was created");
    
    }
}
