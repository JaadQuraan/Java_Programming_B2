package day24_methods;

public class LastCharacters2D {
    public static void main(String[] args) {

        String [][] words = {
                {"Java", "is", "fun"}, // asn
                {"Softskills", "ehhh"}, // sn
                {"Loops", "are","getting", "easier"} // segr
        };

//        System.out.println(words.length); // 3
//        System.out.println(words[2].length); //4

        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < words[j].length; i++) {
                String eachWord =  words[j][i];
                System.out.print(eachWord.charAt(eachWord.length()-1));
            }
            System.out.println();
        }

        System.out.println("------------------------------------");
        for (String [] eachArr : words) {
            for (String eachElement : eachArr) {
                System.out.print(eachElement.charAt(eachElement.length() - 1));
            }
            System.out.println();
        }




    }
}
