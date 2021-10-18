// 변수값 교환

package sec01.exam03;

public class VariableExchangeExample{
    public static void main(String[] args){
        // 3을 변수 x의 초기값으로 저장
        int x = 3;
        // 5를 변수 y의 초기값으로 저장
        int y = 5;
        // x:3, y:5 를 출력
        System.out.println("x:" + x + ", y:" + y);

        // 변수 x(3)를 변수 temp의 초기값으로 저장
        int temp = x;
        // 변수 x에 변수 y(5)를 저장
        x = y;
        // 변수 y에 변수 temp(3)을 저장
        y = temp;
        // x:5, y:3
        System.out.println("x:" + x + ", y:" + y);
    }
}