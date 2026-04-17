/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringoperation;


import java.util.Scanner;
public class StringOperation {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        
        int charCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                charCount++;
            }
        }

        
        String words[] = sentence.trim().split(" ");
        int wordCount = words.length;

      
        int vowelCount = 0;
        String lower = sentence.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
         System.out.println("Characters (without spaces): " + charCount);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total vowels: " + vowelCount);
    }

       
    }
    

