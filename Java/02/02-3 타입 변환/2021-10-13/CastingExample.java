// 강제 타입 변환

package sec03.exam02;

public class CastingExample{
    public static void main(String[] args){
        // 44032를 변수 intValue의 초기값으로 저장
        int intValue = 44032;
        // 44032를 문자열 "44032"로 변형해 변수 charValue의 초기값으로 저장
        char charValue = (char) intValue;
        // 44032(문자열) 를 출력
        System.out.println(charValue);

        // 500을 변수 longValue의 초기값으로 저장
        long longValue = 500;
        // long 타입 변수  longValue를 int형으로 변형해 변수 intValue에 저장
        intValue = (int) longValue;
        // 500 을 출력
        System.out.println(intValue);

        // 3.14를 변수 doubleValue의 초기값으로 저장
        double doubleValue = 3.14;
        // double 타입 변수 doubleValue를 int형으로 변형해 변수 intValue에 저장
        intValue = (int) doubleValue;
        // 3 을 출력
        System.out.println(intValue);
    }
}