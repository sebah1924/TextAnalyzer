/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebah
 */
public class TextAnalyzer {
    
    
    public  int countCharacters(String text) {
      return text.length();
    }
    
    public  int countWords(String text) {
        
        int count=0;
        
        for (int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if (i==0 && c!=' ')
                count++;
            char c0;
              boolean enterWord=false;         
            if (i>0) {
                 c0 = text.charAt(i-1);
             enterWord=c!=' ' && c0==' ';
            }  
            if (enterWord)
                count++;
        }
     return count;
    }
}
