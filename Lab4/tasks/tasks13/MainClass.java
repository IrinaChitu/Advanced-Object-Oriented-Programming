package tasks.tasks13;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        //Task 1
        String trialString = "Mergem la mare de 1 mai!";
        System.out.println(trialString.indexOf("mare"));
        System.out.println(trialString.lastIndexOf('m'));
        System.out.println(trialString.length());
        String[] splitString = trialString.split("la");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);

        //Task 2
        System.out.print(removeLeadingWhitespaces("  Merg sa petrec dupa!  "));
        System.out.println("<- trailing whitespaces");

        //Task 3
        System.out.println(concatenateStringOnCondition("Ele fac ", "cafele"));

        //Task 7
        //int arr[]

    }

    public static String removeLeadingWhitespaces(String stringToBeModified) {
//        Regex expressions in Java:
//            \\s  - matches a single whitespace
//            \\s+ - matches one or many whitespaces
        String regex = "\\s+";
        //remove only the leading whitespaces
        stringToBeModified = stringToBeModified.replaceFirst(regex, "");
        //removes also the trailing whitespaces
        //stringToBeModified = stringToBeModified.trim();
        return stringToBeModified;
    }

    public static String concatenateStringOnCondition(String a, String b) {
        String concatenate;
        String substr = b.substring(b.length()-3);
        //System.out.println(substr);
        if(a.toLowerCase().startsWith(substr.toLowerCase())) {
            concatenate = a.concat(b);
        }
        else {
            concatenate = "No se puedo";
        }
        return concatenate;
    }

    public static Character secondMostFrequentChar(String s) {
        HashMap<Character,Integer> letters;
        for(Character c: s) {   // i < s.length()
            if(letters.get(c) == null) {
                letters.put(c, 1);
            }
            else {
                letters.put(c, letters.get(c)+1);
            }
        }
    }
}
