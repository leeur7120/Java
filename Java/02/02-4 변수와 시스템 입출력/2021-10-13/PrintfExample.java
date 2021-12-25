// printf() 메소는 사용 방법

package sec04.exam01;

public class PrintfExample{
    public static void main(String[] args){
        // 정수 123을 int형 변수 value의 초기값으로 저장
        int value = 123;
        // 상품의 가격:123원 을 출력
        System.out.printf("상품의 가격:%d원\n", value);
        // 상품의 가격:   123원 을 출력
        System.out.printf("상품의 가격:%6d원\n", value);
        // 상품의 가격:123   원 을 출력
        System.out.printf("상품의 가격:%-6d원\n", value);
        // 상품의 가격:000123원 을 출력
        System.out.printf("상품의 가격:%06d원\n", value);

        // 3.14159 * 10 * 10한 값( 실수 314.159 )을 double형 변수 area의 초기값으로 저장
        double area = 3.14159 * 10 * 10;
        // 반지름이 10인 원의 넓이:    314.16 을 출력
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
        
        // 문자열 "홍길동"을 String형 변수 name의 초기값으로 저장
        String name = "홍길동";
        // 문자열 "도적"을 String형 변수 job의 초기값으로 저장
        String job = "도적";
        //      1 | 홍길동        |         도적 을 출력
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}