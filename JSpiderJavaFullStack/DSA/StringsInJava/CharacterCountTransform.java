package DSA.StringsInJava;

public class CharacterCountTransform {

    public static String transformString(String input) {
        input = input.toUpperCase();  // Optional: for consistent case
        String result = "";

        // Step 1: Count occurrences of each character (using array)
        int[] charCount = new int[256];  // ASCII character count array

        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        // Step 2: Process string and build result
        int[] printedCount = new int[256];  // Track how many times a char was printed as number

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (charCount[ch] == 1) {
                result += ch;
            } else {
                printedCount[ch]++;
                result += printedCount[ch];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "HELLO WORLD";
        String output = transformString(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
 
    
}
