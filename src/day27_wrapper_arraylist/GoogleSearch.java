package day27_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 1,580,000,000 results (0.41 seconds)";
        String [] resArr = result.split(" "); //  ["About", "1,580,000,000", "results", "(0.41", "seconds");]

        String numStr = resArr[1].replace(",", "");
        //"(0.41", "seconds")
        String timeStr = resArr[3].substring(1);
        System.out.println(numStr);
        System.out.println(timeStr);
        System.out.println("--------------------");

        long resultNum = Long.parseLong(numStr);
        double resultTime = Double.parseDouble(timeStr);

        System.out.println(resultNum);
        System.out.println(resultTime);

        if(resultNum > 0){
            System.out.println("Test PASSED");
        }
        if(resultTime >=0 && resultTime<= 1){
            System.out.println("Test PASSEd");
        }
    }
}
