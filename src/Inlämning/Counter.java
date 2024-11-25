package Inlämning;

public class Counter {

    private int totalCharacters;
    private int totalLines;

    public Counter() {
    }

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

}
