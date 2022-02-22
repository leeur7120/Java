// 삼항 연산자

package sec02.exam11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        // 정수 85를 int형 변수 score의 초기값으로 저장
        int score = 85;
        // (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C')한 값()을 char형 변수 grade의 초기값으로 저장
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        // 점은 등급입니다. 를 출력
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}