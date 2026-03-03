import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static inner class to store character and pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store character patterns
    static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(c);
                line.append(cp.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}