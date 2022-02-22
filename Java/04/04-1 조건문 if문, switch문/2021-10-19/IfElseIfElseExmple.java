// if-else if-else문

package sec01.exam03;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        // 정수 75를 int형 변수 score의 초기값으로 저장
        int score = 75;

        if (score >= 90) { // 만약 score가 정수 90보다 크거나 같으면
            // 점수가 100 ~ 90입니다. 를 출력
            System.out.println("점수가 100 ~ 90입니다.");
            // 등급은 A입니다. 를 출력
            System.out.println("등급은 A입니다.");
        } else if (score >= 80) { // 아니면 ( score가 정수 80보다 크거나 같으면 )
            // 점수가 80 ~ 89입니다. 를 출력
            System.out.println("점수가 80 ~ 89입니다.");
            // 등급은 B입니다. 를 출력
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) { // 아니면 ( score가 정수 70보다 크거나 같으면 )
            // 점수가 70 ~ 79입니다. 를 출력
            System.out.println("점수가 70 ~ 79입니다.");
            // 등급은 C입니다. 를 출력
            System.out.println("등급은 C입니다.");
        } else { // 아니면
            // 점수가 70 미만입니다. 를 출력
            System.out.println("점수가 70 미만입니다.");
            // 등급은 D입니다. 를 출력
            System.out.println("등급은 D입니다.");
        }
    }
}