// 대입 연산자

package sec02.exam10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        // 정수 0을 int형 변수 result의 초기값으로 저장
        int result = 0;
        // result + 10한 값( 10 )을 변수 result에 저장
        result += 10;
        // result=10 을 출력
        System.out.println("result=" + result);
        // result - 5한 값( 5 )을 변수 result에 저장
        result -= 5;
        // result=5 를 출력
        System.out.println("result=" + result);
        // result * 3한 값( 15 )를 변수 result에 저장
        result *= 3;
        // result=15 를 출력
        System.out.println("result=" + result);
        // result / 5한 값( 3 )을 변수 result에 저장
        result /= 5;
        // result=3 을 출력
        System.out.println("result=" + result);
        // result % 3한 값( 0 )을 변수 result에 저장
        result %= 3;
        // result=0 을 출력
        System.out.println("result=" + result);
    }
}