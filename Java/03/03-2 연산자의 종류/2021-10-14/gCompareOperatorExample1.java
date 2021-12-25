// 비교 연산자

package sec0202.exam07;

public class ComareOperatorExample1 {
    public static void main(String[] args) {
        // 정수 10을 int형 변수 num1의 초기값으로 저장
        int num1 = 10;
        // 정수 10을 int형 변수 num2의 초기값으로 저장
        int num2 = 10;
        // num1 == num2( num1이랑 num2가 같은지 검사 )한 값( true )을 boolean형 변수 result1의 초기값으로 저장
        boolean result1 = (num1 == num2);
        // num1 != num2( num1이랑 num2가 다른지 검사 )한 값( false )을 boolean형 변수 result2의 초기값으로 저장
        boolean result2 = (num1 != num2);
        // num1 <= num2( num1이 num2보다 작거나 같은지 검사 )한 값( true )을 boolean형 변수 result3의 초기값으로 저장
        boolean result3 = (num1 <= num2);
        // result1=true 를 출력
        System.out.println("result1=" + result1);
        // result2=false 를 출력
        System.out.println("result2=" + result2);
        // result3=true 를 출력
        System.out.println("result3=" + result3);

        // 문자 A를 char형 변수 char1의 초기값으로 저장
        char char1 = 'A';
        // 문자 B를 char형 변수 char2의 초기값으로 저장
        char char2 = 'B';
        // char1 < char2( char1이 char2보다 작은지 검사 )한 값( true )을 boolean형 변수 result4의 초기값으로 저장
        boolean result4 = (char1 < char2);
        // result4=true 를 출력
        System.out.println("result4=" + result4);
    }
}