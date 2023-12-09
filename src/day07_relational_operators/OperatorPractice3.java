package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int h = 5; //I declared an int variable called h and assigned a value 5 to it.
        int p = h; //I declared an int variable p and assigned a value from variable h

        h++;// post-increment | no other code | Just increase by 1
        System.out.println("h: "+h); //output: 6
        System.out.println("p: "+p); //output: 5

        int k = h++; //Took the 6 and assigned it to k
        System.out.println("h:"+ h); //h was updated to 7
        System.out.println("k: "+ k); //k=6

        int g = ++h; //first updates h to 8. Thats why g is also 8
        System.out.println("h: "+ h);
        System.out.println("g: " + g);

    }
}
