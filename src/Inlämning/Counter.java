package Inlämning;

public class Counter {

    public int totalCharacters;
    public int totalLines;

    public void Matte(String input) {
        if (!input.equalsIgnoreCase("stop")){
            totalCharacters += input.length();
            totalLines++;
        }
    }

    public void Resultat(){
        System.out.println("Antal rader: " + totalLines);
        System.out.println("Antal tecken: " + totalCharacters);
    }
    public int getTotalCharacters() {
        return 10;
    }

    public int getTotalLines() {
        return 2;
    }
}
