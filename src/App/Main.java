package App;

public class Main {
    public static int init_max(int a, int b){
        if(a >b){
            return a;
        }else{
            return b;
        }
    }
    public static int init_min(int a, int b){
        if(a <b){
            return a;
        }else{
            return b;
        }
    }

    public static boolean isPositive(int a){
        if(a > 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String [] args)
    {
        ;
    }
}
