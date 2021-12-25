// char 타입의 산술 연산

package sec02.exam05;

public class eCharOperationExample {
    public static void main(String[] args) {
        // 문자 A( 아스키 코드값 65 )와 숫자 1을 더해서 B( 아스키 코드값 66 )로 변형해 char형 변수 c1의 초기값으로 저장
        char c1 = 'A' + 1;      // <--- char c1 = 66;으로 컴파일됨
        // 문자 A를 char형 변수 c2의 초기값으로 저장
        char c2 = 'A';
        // char c3 = c2 + 1;    <--- char 변수가 산술 연산에 사용되면 int 타입으로 변환되므로 연산 결과는 int 타입이 됨
        // c1: B 을 출력
        System.out.println("c1: " + c1);
        // c2: A 를 출력
        System.out.println("c2: " + c2);
        // System.out.println("c3: " + c3)
    }
}