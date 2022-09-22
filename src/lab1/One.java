package lab1;

public class One {
    double c;
    double z;
    double w;

    One(double c, double z, double w){
        this.c = c;
        this.z = z;
        this.w = w;
    }
    void co_one_cl(int i ){
        double r = (z - w) / i;
        System.out.println(r);
    }
    double met_2_1(){
        return c - z;
    }
}
