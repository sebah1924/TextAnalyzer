
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
        text = text.toLowerCase();
        for (int i=0; i<text.length(); i++) {
               char c = text.charAt(i);
               switch (c) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        count++;
        break;
}   
        }
        return count;
    }
}
