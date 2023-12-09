package day11_if_statements;

import java.util.Scanner;

/*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French
    6 - Azerbaijan

    based on the number they picked print a message:

    1 : "hello, thanks for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    6 : "salam, zeng ettiginiz ucun mennatdariq"
    any other number: "We will use English by default"
 */
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number for what language you want to use \n\t1-English\n\t2-Spanish \n\t3-Turkish\n\t4-Russian\n\t5-French\n\t6-Azerbaijan");
        System.out.println();
        System.out.print("\tYour choice: ");
        int userOption = input.nextInt();

        String message;

        if(userOption==1){
            message = "hello, thanks for your call";
        } else if (userOption==2) {
            message = "hola, gracias para llamar";
        } else if (userOption==3) {
           message = "merhaba, aradiginiz icin tesekkurler";
        } else if (userOption==4) {
            message = "privet, spasibo za vash zvonok";
        } else if (userOption==5) {
            message = "Merci ,pour votre appel";
        } else if (userOption==6) {
            message = "salam, zeng ettiginiz ucun mennatdariq";
        } else{
            message = "Invalid number";
        }
        System.out.println("\n\t"+ message);

    }
}
