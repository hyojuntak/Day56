package JC.Day56;

public class jegu {
    public static void main(String[] args) {
        
        int x = 2;
        int y = 1;
        int count=1;
        int result = 1;
        
        while (count<6) {
            result = (int) Math.pow(x, y);
            ++y;
            ++count;
            System.out.println(result);
        }
        
    }
}
