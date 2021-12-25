// 비교 연산자

package sec02.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        // 정수 1을 int형 변수 v2의 초기값으로 저장
        int v2 = 1;
        // 실수 1.0을 double형 변수 v3의 초기값으로 저장
        double v3 = 1.0;
        // true 를 출력
        System.out.println(v2 == v3); // true
        
        // 실수 0.1을 double형 변수 v4의 초기값으로 저장
        double v4 = 0.1;
        // 실수 0.1을 float형 변수 v5의 초기값으로 저장
        float v5 = 0.1f;
        // false 를 출력
        System.out.println(v4 == v5); // false
        // true 를 출력
        System.out.println((float)v4 == v5); // true
    }
}