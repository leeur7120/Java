// 산술 연산자

package sec02.exam04;

public class dArithmeticOperatorExample {
    public static void main(String[] args) {
        // 정수 5를 int형 변수 v1의 초기값으로 저장
        int v1 = 5;
        // 정수 2를 int형 변수 v2의 초기값으로 저장
        int v2 = 2;

        // v1 + v2( 5 + 2 )한 값( 정수 7 )을 int형 변수 result1의 초기값으로 저장
        int result1 = v1 + v2;
        // result1=7 을 출력
        System.out.println("result1=" + result1);

        // v1 - v2( 5 - 2 )한 값( 정수 3 )을 int형 변수 result2의 초기값으로 저장
        int result2 = v1 - v2;
        // result2=3 을 출력
        System.out.println("result2=" + result2);

        // v1 * v2( 5 * 2 )한 값( 정수 10 )을 int형 변수 result3의 초기값으로 저장
        int result3 = v1 * v2;
        // result3=10 을 출력
        System.out.println("result3=" + result3);

        // v1 / v2( 5 / 2 )한 값( 실수 2.5 )을 int형 변수 result4의 초기값으로 저장
        int result4 = v1 / v2;
        // result4=2 를 출력
        System.out.println("result4=" + result4);

        // v1 % v2( 5 % 2 )한 값( 정수 1 )을 int형 변수 result5의 초기값으로 저장
        int result5 = v1 % v2;
        // result5=1 을 출력
        System.out.println("result5=" + result5);

        // v1 / v2( 5 / 2)한 값( 실수 2.5 )을 double타입으로 강제 타입 변환해 변수 result6의 초기값으로 저장
        double result6 = (double) v1 / v2;
        // result6=2.5 를 출력
        System.out.println("result6=" + result6);
    }
}