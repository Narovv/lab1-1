package lab1;

public class Main {

    public static void main(String[] args){
        One one = new One(1000.0, 900.0, 500.0);
        Two two = new Two(1000.0, 600.0 , 300.0);
        Three three = new Three(1000.0, 700.0, 600.0);

        one.co_one_cl(1);
        System.out.println("Rez z parametrom : "+ one.met_2_1());
        two.co_two_cl();
        System.out.println("Rez z parametrom : "+ two.met_2_2(1));
        three.co_three_cl();
        System.out.println("Rez z parametrom : "+ three.met_2_3(1));
    }
}
