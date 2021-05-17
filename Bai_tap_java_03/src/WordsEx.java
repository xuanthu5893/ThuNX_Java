public class WordsEx {
    static int countWord(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
                while (s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '.' && i < s.length() - 1) {
                    i++;
                }
            }
        }
        return count;
    }
}
