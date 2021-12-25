// 자동 타입 변환

package sec03.exam01;

public class PromotionExample{
    public static void main(String[] args){
        // 자동 타입 변환
        // 정수 10 을 byte형 변수 byteValue의 초기값으로 저장
        byte byteValue = 10;
        // 변수 byteValue(10)를 int형 변수 intValue의 초기값으로 저장
        int intValue = byteValue;
        // intValue: 10 을 출력
        System.out.println("intValue: " + intValue);

        // 문자 가를 char형 변수 charValue의 초기값으로 저장
        char charValue = '가';
        // int형 변수 intValue에 변수 charValue('가')를 저장
        intValue = charValue;
        // 가의 유니코드: 44032 를 출력
        System.out.println("가의 유니코드: " + intValue);

        // 정수 50을 int형 변수 intValue에 저장
        intValue = 50;
        // 변수 intValue(정수 50)를 long형 변수 longValue의 초기값으로 저장
        long longValue = intValue;
        // longValue: 50 을 출력
        System.out.pirntln("longValue: " + longValue);
        
        // 정수 100을 long형 변수 longValue에 저장
        longValue = 100;
        // 변수 longValue( 정수 100 )을 float형 변수 floatValue의 초기값으로 저장
        float floatValue = longValue;
        // floatValue: 100.0 을 출력
        System.out.println("floatValue: " + floatValue);

        // 실수 100.5를 float형 변수 floatValue에 저장
        floatValue = 100.5F;
        // 변수 floatValue(실수 100.5)를 double형 변수 doubleValue의 초기값으로 저장
        double doubleValue = floatValue;
        // doubleValue: 100.5 를 출력
        System.out.println("doubleValue: " + doubleValue);
    }
}