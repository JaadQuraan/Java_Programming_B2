package day14_string;
/*
    .equals(String) -->returns boolean
    .equalIgnoreCase(String) -->returns boolean
    .length() --> returns int
    .toUpperCase() --> returns new String all in UPPERCASE
    .toLowerCase() --> returns new String all in lowercase
    .startsWith(String) -->returns boolean
    .endsWith(String) -->returns boolean
    .contains(String) -->returns boolean
    .trim() --> Removing spaces from beginning and end only
    .isEmpty() --> returns boolean if there is NO CHARACTER at all including space --> " "
    .isBlank --> returns boolean if there ONLY EMPTY SPACES inside the double quotation
 */
public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";

        System.out.println(str.isEmpty()); //false
        str = ""; //re-assigned it to "";
        System.out.println(str.isEmpty()); //true

        str = " "; //REASSIGNED it to " ";
        System.out.println(str.isEmpty()); //false.  Empty space is a character.  SO --> false

        str =  " "; //Did not create new object memory. Used string literal
        System.out.println(str.isBlank()); // if you have just space its true

        str = "   ";
        System.out.println(str.isBlank()); //still true

        str = "              .            ";
        System.out.println(str.isBlank()); //false because of the .







    }
}

