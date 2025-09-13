package DSA.StringsInJava;

public class CharacterCountTransform {


      public static void main(String[] args) {
        String input = "HELLO WORLD";

        String outputWithArray = transformWithArray(input);
        String outputPureNaive = transformPureNaive(input);

        System.out.println("Input:               " + input);
        System.out.println("Output (with array): " + outputWithArray);
        System.out.println("Output (pure naive): " + outputPureNaive);
    }


    
    // approach using arrays
    public static String transformWithArray(String input) {
        input = input.toUpperCase();
        String result = "";

        int[] charCount = new int[256];    // Store total frequency of each character
        int[] printedCount = new int[256];  // Track how many times each char is printed as a number

        // Count total occurrences of each character
        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        // Build result string
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

    //  approach without using any array
    public static String transformPureNaive(String input) {
        input = input.toUpperCase();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Count total occurrences of currentChar in the entire string
            int totalCount = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    totalCount++;
                }
            }

            if (totalCount == 1) {
                result += currentChar;
            } else {
                // Count occurrences up to current position
                int printedCount = 0;
                for (int k = 0; k <= i; k++) {
                    if (input.charAt(k) == currentChar) {
                        printedCount++;
                    }
                }
                result += printedCount;
            }
        }

        return result;
    }

  
}