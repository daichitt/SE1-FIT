package Tutorial12.src.main.java;

public class StringModifier {
    public static void main(String[] args) throws Exception {
        String text = "sassa";
        modifyString(text);
    }

    public static String modifyString(String input) throws Exception {

//        input = input.replaceAll("\\s", "");
        if (input == null || input.isEmpty()) {
            throw new Exception("Input string is null or empty");
        }
        char firstChar = input.charAt(0);
        if (!Character.isLetter(firstChar)) {
            throw new Exception("First character is not a letter");
        }
        // make uppercase
        String modified = input.replaceAll("\\s+", "");
        return Character.toUpperCase(modified.charAt(0)) + modified.substring(1);
    }
}
