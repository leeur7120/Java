// 연산식에서 자동 타입 변환

package sec03.exam05;

public class OperationsPromotionExample{
    public static void main(String[] args){
        // 10을 byte형 변수 byteValue1의 초기값으로 저장
        byte byteValue1 = 10;
        // 20을 byte형 변수 byteValue2의 초기값으로 저장
        byte byteValue2 = 20;
        // byte byteValue3 = byteValue1 + byteValue2;       <--- 컴파일 에러
        // 10 + 20한 값을 int형 변수 intValue의 초기값으로 저장
        int intValue = byteValue1 + byteValue2;
        // 30 을 출력
        System.out.println(intValue);

        // A 를 char형 변수 charValue1의 초기값으로 저장
        char charValue1 = 'A';
        // 1 을 char형 변수 charValue2의 초기값으로 저장
        char charValue2 = 1;
        // char charValue3 = charValue1 + charValue2;       <--- 컴파일 에러
        // charValue1 + charValue2(65 + 1)한 값을 int형 변수 intValue의 초기값으로 저장
        int intValue2 = charValue1 + charValue2;
        // 유니코드=66 을 출력
        System.out.println("유니코드=" + intValue2);
        // 출력문자=B 를 출력(B의 유니코드 = 66)
        System.out.pirntln("출력문자=" + (char)intValue2);
        
        // 숫자 10을 int형 변수 intValue3의 초기값으로 저장
        int intValue3 = 10;
        // 변수 intValue3 / 4한 값을 int형 변수 intValue4의 초기값으로 저장
        int intValue4 = intValue3/4;
        // 2 를 출력
        System.out.pirntln(intValue4);

        // 숫자 10을 int형 변수 intValue5의 초기값으로 저장
        int intValue5 = 10;
        // int intValue6 = 10 / 4.0;        <--- 컴파일 에러
        // intValue5 / 4.0 한 값을 double형 변수 doubleValue의 초기값으로 저장
        double doubleValue = intValue5 / 4.0;
        // 2.5 를 출력
        System.out.println(doubleValue);

        // 숫자 1을 int형 변수 x의 초기값으로 저장
        int x = 1;
        // 숫자 2를 int형 변수 y의 초기값으로 저장
        int y = 2;
        // x / y 한 값을 double형으로 바꿔 double형 변수 result의 초기값으로 저장
        double result = (double) x / y;
        // 0.5 를 출력
        System.out.println(result);
    }
}