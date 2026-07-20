public class Main {
    public static void main(String[] args) {

        System.out.println("Text Analyzer v0.1");

        TextAnalyzer analyzer = new TextAnalyzer();

String text = "El analizador de texto cuenta palabras y caracteres usando Java este proyecto practica estructuras de datos algoritmos y manejo de cadenas";
       
int characters = analyzer.countCharacters(text);
        int words = analyzer.countWords(text);
        int vowels = analyzer.countVowels(text);
        int consonants= analyzer.countConsonants(text);

        System.out.println("Texto: " + text);
        System.out.println("Caracteres: " + characters);
        System.out.println("Palabras: " + words);
          System.out.println("Vocales: " + vowels);
              System.out.println("Consonantes: " + consonants);
        
    }
}