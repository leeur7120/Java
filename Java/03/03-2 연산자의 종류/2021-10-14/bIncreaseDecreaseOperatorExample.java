// 증감 연산자

package sec02.exam02;

public class bIncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        // 정수 10을 int형 변수 x의 초기값으로 저장
        int x = 10;
        // 정수 10을 int형 변수 y의 초기값으로 저장
        int y = 10;
        // int형 변수 z 선언
        int z;

        // -------------------- 를 출력
        System.out.println("--------------------");
        // 다른 연산을 수행한 후 피연산자 변수 x의 값을 1 증가시킴
        x++;
        // 다른 연산을 수행하기 전 피연산자 변수 x의 값을 1 증가시킴
        ++x;
        // x=12 를 출력
        System.out.println("x=" + x);

        // -------------------- 를 출력
        System.out.println("--------------------");
        // 다른 연산을 수행한 후 피연산자 변수 y의 값을 1 감소시킴
        y--;
        // 다른 연산을 수행하기 전 피연산자 변수 y의 값을 1 감소시킴
        --y;
        // y=8 을 출력
        System.out.println("y=" + y);

        // -------------------- 를 출력
        System.out.println("--------------------");
        // 다음 연산( 37행 )을 실행 후 변수 z의 값을 1 증가시킴
        z = x++;
        // z=12 를 출력
        System.out.println("z=" + z);
        // x=13 을 출력
        System.out.println("x=" + x);

        // -------------------- 를 출력
        System.out.println("--------------------");
        // 다음 연산( 46행 )을 실행하기 전 변수 z의 값을 1 증가시킴
        z = ++x;
        // z=14 를 출력
        System.out.println("z=" + z);
        // x=14 를 출력
        System.out.println("x=" + x);

        // -------------------- 를 출력
        System.out.println("--------------------");
        // 15 + 8 한 값( 23 )을 변수 z에 저장
        z = ++x + y++;
        // z=23 을 출력
        System.out.println("z=" + z);
        // x=15 를 출력
        System.out.println("x=" + x);
        // y=9 를 출력
        System.out.println("y=" + y);
    }
}