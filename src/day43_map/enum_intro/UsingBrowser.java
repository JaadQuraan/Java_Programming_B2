package day43_map.enum_intro;

public class UsingBrowser {

    public static void main(String[] args) {

        Browser browser = Browser.CHROME;
        Browser browser2 = Browser.EDGE;
        //reference of enum class and value is Browser.CHROME
        switch (browser){

        case EDGE:
            System.out.println("Opening EDGE");
            break;
        case CHROME:
        case SAFARI:
            System.out.println("Opening CHROME or SAFARI");
            break;
        }



    }
}
