/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge5;

/**
 * 
 *
 * Alex Garcia 5929040 (your Panther Id)
 *  
 *  Title: Challenge 5          
* 
* Semester:         COP3804 Spring 2022
* Lecturer's Name:  (Maria Charters)
*   Description of Program’s Functionality:
*   Change the letters x and y in each string provided in the rubric
*
*  
*/ 
public class Challenge5 {

    public static void main(String[] args) {
        // hard coded the "words" pprovided in the rubric
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("yyhiyy"));
        System.out.println(changeXY("yhiyhiy"));
        
    }
    
    public static String changeXY(String word){
        
        //This if statement act as the base case 
        if (word.length() < 1) {
            return word;
        }
        
        // charAt starts with the first element of the words provided above
        char i = word.charAt(0);
        
        // substring essentially functions as a way for the individual chars of a string to counted as an element
        // an example would be how you would print the substring of the string "This is" and you would want the beginning index to be 
        // 0 and the endIndex to be so you can print out "This is" Spaces are also included in substrings as characters
        if(word.charAt(0) == 'x'){
            i = 'y';
            word = 'y' + word.substring(1);
        }
        else if(word.charAt(0) == 'y'){
            i = 'x';
            word = 'x' + word.substring(1);
        }
        
        // return statement is used to finally output the function of going through the if else and changing all 'x's to 'y's and 'y's to 'x's
      return i + changeXY(word.substring(1));
    }
        
     

}

