package problemsolving.recursion;

public class PowerFunctionImplementation {
    public static double pow(double b, long e) {
        if (e == 0) return 1;

        if (e < 0) return 1 / pow(b, -e);
        double temp = pow(b, e / 2);

        if(e%2==0) return temp*temp;

        else return b*temp*temp;
    }

    public static void main(String[] args) {
        double b=2.0000;
        long e=10;

        double ans=pow(b,e);
        System.out.println(ans);
    }
}
