// 부호 연산자

package sec02.exam01;

public class aSignOperatorExample {
    public static void main(String[] args) {
        // 정수 -100 을 int형 변수 x의 초기값으로 저장
        int x = -100;
        // 피연산자 x의 부호를 유지해서 -100을  int형 변수 result1의 초기값으로 저장
        int result1 = +x;
        // 피연산자 x의 부호를 변경해서 100을 int형 변수 result2의 초기값으로 저장
        int result2 = -x;
        // result1=-100 을 출력
        System.out.println("result1=" + result1);
        // result2=100 을 출력
        System.out.println("result2=" + result2);

        // 정수 100 을 byte형 변수 b의 초기값으로 저장
        byte b = 100;
        // byte result3 = -b;       <--- byte 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로 컴파일 에러 발생
        // 피연산자 b의 부호를 변경해서 -100을 int형 변수 result3의 초기값으로 저장
        int result3 = -b;
        // result3=-100 을 출력
        System.out.println("result3=" + result3);
    }
}