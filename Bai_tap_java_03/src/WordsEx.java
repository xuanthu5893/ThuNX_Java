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
    static int count2(String chuoi1){
        int count1 = 0;
        for (int i=1; i<chuoi1.length(); i++){
            if((chuoi1.charAt(i)=='\n')||(chuoi1.charAt(i)==' ')){
                count1++;
            }
        }return count1;
    }
}
