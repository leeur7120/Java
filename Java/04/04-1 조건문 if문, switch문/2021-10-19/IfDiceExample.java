// 주사위의 번호 뽑기

package sec01.exam04;

public class IfDiceExample {
    public static void main(String[] args) {
        // (int) (Mth.random() * 6) + 1한 값()을 int형 변수 num의 초기값으로 저장
        int num = (int) (Mth.random() * 6) + 1;

        if (num == 1) { // 만약 num이 1이라면( 1과 같다면 )
            // 1번이 나왔습니다. 를 출력
            System.out.println("1번이 나왔습니다.");
        } else if (num == 2) { // 아니면 num이 2라면( 2와 같다면 )
            // 2번이 나왔습니다. 를 출력
            System.out.println("2번이 나왔습니다.");
        } else if (num == 3) { // 아니면 num이 3라면( 3와 같다면 )
            // 3번이 나왔습니다. 를 출력
            System.out.println("3번이 나왔습니다.");
        } else if (num == 4) { // 아니면 num이 4라면( 4와 같다면 )
            // 4번이 나왔습니다. 를 출력
            System.out.println("4번이 나왔습니다.");
        } else if (num == 5) { // 아니면 num이 5라면( 5와 같다면 )
            // 5번이 나왔습니다. 를 출력
            System.out.println("5번이 나왔습니다.");
        } else { // 아니면
            // 6번이 나왔습니다. 를 출력
            System.out.println("6번이 나왔습니다.");
        }
    }
}