package JC.Day56;

public class WrapperTest {
    public static void main(String[] args) {
        int myInt = 5316;
        System.out.println("myInt = "+myInt);

        String myString = new Integer(myInt).toString();
        System.out.println("myString = "+myString);

        myString = myString.replace('6', '4');

        float myFloat = Float.valueOf(myString).floatValue();
        System.out.println("myfloat = "+myFloat);
    }
}
/**
 * 형 변환
 * 자바가 c와 규별되는 큰 특징 중의 하나가 데이터형에 대한 검사가 철저하다.
 * 명령어를 사용할때 미리 정해놓은 데이터 형을 사용해야만 한다.
 * 다른 형으로 사용하고자 할떄는 명시적으로 데이터형태를 변환해주어야 한다.
 * 의도적으로 형변환하는 방법은 두가지가 있다. casting wrapper가 있다.
 */
