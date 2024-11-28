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

    public int getTotalCharacters() {
        return totalCharacters;
    }

    public int getTotalLines() {
        return totalLines;
    }
}
