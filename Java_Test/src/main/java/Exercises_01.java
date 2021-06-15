public class Exercises_01 {
    static int count(String str) {
        int countUpperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) countUpperCase++;
        }
        return countUpperCase;


    }
    static String Uppercase(String str){
        String[] arr = str.split(" ");
        String str2 = "";
        for (String j : arr) {
            str2 = str2 + (j.substring(0, 1).toUpperCase() + j.substring(1).toLowerCase());
            str2 = str2 + " ";
        }
        return str2;
    }
    static String Uppercase2(String str){

        String str2 = "";
        for (int i =0; i<str.length(); i++) {
            String a = Character.toString(str.charAt(i));
            if(i == 0 )str2 = str2 + a.toUpperCase();
            else if (i>2 && Character.toString(str.charAt(i-2)).equals("."))str2 = str2 + a.toUpperCase();
            else str2 = str2 + a.toLowerCase();
        }
        return str2;
    }
}

