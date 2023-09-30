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
 */
public class RemoveSpace {
    public static void main(String[] args) {

        String s = "     Thursday      ";
        System.out.println(s);
        System.out.println(s.length());

        System.out.println(s.trim()); //This method will remove empty spaces from beginning and end only
        System.out.println(s.length()); //19. Not re-assigned here

        s = s.trim();// "     Thursday      " --> "Thursday"
        System.out.println(s.length()); //8

        System.out.println("-----------------------");
        System.out.println(s.startsWith("Thu")); //true "Thursday"

        String str = "     java is fun     ";
        System.out.println(str.endsWith(" fun")); //false

        str.trim();
        System.out.println(str.endsWith(" fun")); //false no re-assignment

        str = str.trim(); //"     java is fun     " --> "java is fun"
        System.out.println(str.endsWith(" fun")); //true






}}
