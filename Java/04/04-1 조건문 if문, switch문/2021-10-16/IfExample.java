// if문

package sec01.exam01;

public class IfExample {
    public static void name(String[] args) {
        // 정수 93을 int형 변수 score의 초기값으로 저장
        int score = 93;

        if (score >= 90) { // 변수 score가 정수 90보다 크거나 같으면
            // 점수가 90보다 큽니다. 를 출력
            System.out.println("점수가 90보다 큽니다.");
            // 등급은 A입니다. 를 출력
            System.out.println("등급은 A입니다.");
        }
        
        if (score < 90) { // 변수 score가 정수 90보다 작으면
            // 점수가 90보다 작습니다. 를 출력
            System.out.println("점수가 90보다 작습니다");
            // 등급은 B입니다. 를 출력
            System.out.println("등급은 B입니다.");
        }
    }
}