// 논리 부정 연산자

package sec02.exam03;

public class cDenyLogicOperatorExample {
    public static void main(String[] args) {
        // 불 true를 boolean형 변수 play의 초기값으로 저장
        boolean play = true;
        // true 를 출력
        System.out.println(play);

        // 변수 play에 false를 저장
        play = !play;
        // false 를 출력
        System.out.println(play);

        // 변수 play에 true를 저장
        play = !play;
        // true 를 출력
        System.out.println(play);
    }
}