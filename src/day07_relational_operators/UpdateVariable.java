package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        //how many different we can add 1
        int a =10;
        a = 10+1;
        a=12;
        a++; //pre-increment or post increment
        a = a + 1;

        //how can I add 10?
        int b=4;
        b = 4 + 10;
        b = b + 10; //Take value from b then add 10. b = 14+10
        b += 10; //b = b +10 shorthand operators, this adds 10 to value b

        int count = 0;
        count += 5;//count = count + 5 ---> count = 5
        System.out.println(count);

        count -=10; //count = -5--> count = 5-10 = -5
        System.out.println(count);

        count *=2; //count = count*2 --> -5*2= -10
        System.out.println(count);

        count /=3; //count = count / 3 --> -10/3 --> count = -3
        System.out.println(count);

        count %= 2; //count = count % 2 = -3 % 2 --> count = -1
        System.out.println(count);


    }
}
