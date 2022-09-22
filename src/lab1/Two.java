package lab1;

public class Two {
    double c;
    double z;
    double w;

    Two(double c, double z, double w){
        this.c = c;
        this.z = z;
        this.w = w;
    }
    void co_two_cl(){
        double r = z - w;
        double p = c - r;
        System.out.println(p);
    }
    double met_2_2(double x){
        return (c - w) * x;
    }
}
