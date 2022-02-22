// 논리 연산자

package sec02.exam09;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        // 문자 A 를 int형 변수 charCode의 초기값으로 저장
        int charCode = 'A'; // 정수 65로 저장됨
        
        
        if /* 만약 */ ((charCode >= 65) & (charCode <= 90)) /* 변수 charCode가 정수 65보다 크거나 같으면 그리고 변수 charCode가 정수 90보다 작거나 같으면 */ {
            // 대문자군요 를 출력
            System.out.println("대문자군요");
        }
        
        if /* 만약 */ ((charCode >= 97) && (charCode <= 122)) /* 변수 charCode가 정수 97보다 크거나 같으면 */ {
            System.out.println("소문자군요");
        }
        
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0 ~ 9 숫자군요");
        }

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요");
        }

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수군요");
        }
    }
}