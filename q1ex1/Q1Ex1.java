/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

/**
 *
 * @author TAU
 */
public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Jane";
        int age1 = 10;
        String hobby1 = "Playing online games";
        System.out.print("Name: " + name1 + "\nAge: " + age1 + "\nFavorite hobby: " + hobby1);
        
        String name2 = "John";
        int age2 = 10;
        String hobby2 = "Playing outside";
        System.out.print("\n\nName: " + name2 + "\nAge: " + age2 + "\nFavorite hobby: " + hobby2);
        
        String name3 = "Jeff";
        int age3 = 8;
        String hobby3 = "Reading";
        System.out.print("\n\nName: " + name3 + "\nAge: " + age3 + "\nFavorite hobby: " + hobby3);
        
        boolean older = age3 > age2;
        System.out.print("\n\n" + name3 + " is older than " + name2 + ": " + older);
        boolean hobby = hobby1 == hobby2;
        System.out.print("\n" + name1 + " and " + name2 + " have the same favorite hobby: " + hobby);
        boolean sameAge = age1 == age2;
        System.out.print("\n" + name1 + " and " + name2 + " have the same age: " + sameAge);
        
    }
    
}
