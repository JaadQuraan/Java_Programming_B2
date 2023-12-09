package day35_inheritance.computer;

public class Store {
    public static void main(String[] args) {

        Computer objCom = new Computer("General OS",300);
        System.out.println(objCom);
        System.out.println();
        Mac objMac = new Mac(512);
        System.out.println(objMac);
        System.out.println();
        Windows objWin = new Windows (500);
//        Windows objWin2 = new Windows (300);
//        Windows objWin3 = new Windows (200);
        System.out.println(objWin);

    }
}
