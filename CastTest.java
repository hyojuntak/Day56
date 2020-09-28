package JC.Day56;

public class CastTest {
    public static void main(String[] args) {
        int myInt ;
        float myFloat = (float)3.0;
        double myDouble;

        myInt = (int) myFloat;
        myDouble = myInt;
        System.out.print("my Int = "+myInt+", myfloat = "+myFloat + ",myDouble = "+myDouble);
    }
}
