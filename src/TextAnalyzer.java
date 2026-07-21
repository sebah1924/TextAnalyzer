
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
    
    public int countVowels(String text){
          int count=0;
        
        for (int i=0; i<text.length(); i++) {
               char c = text.charAt(i);
               if(isVowel(c))
                   count++;
        }
        return count;
    }
    
    public int countConsonants(String text) {
         int count=0;
        
        for (int i=0; i<text.length(); i++) {
               char c = text.charAt(i);
               if (Character.isLetter(c) && !isVowel(c) ) 
                   count++;
    }
    return count;
}
private boolean isVowel(char c) {
    boolean vowel=false;
    c=Character.toLowerCase(c);
             switch (c) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        vowel =true;
        return true;
}   
             return vowel;
}

public String reverseText (String text){
    String reverse= "";
    for (int i=text.length()-1; i>=0; i--) {
             char c = text.charAt(i);
             reverse+=c;
        
    }
return reverse;
}

}


