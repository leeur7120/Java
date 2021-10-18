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
        //
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.pirntln("출력문자=" + (char)intValue2);
        
        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.pirntln(intValue4);

        int intValue5 = 10;
        // int intValue6 = 10 / 4.0;        <--- 컴파일 에러
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);

        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);
    }
}