// 변수 사용

package sec01.exam02;

public class VariableUseExample{
    public static void main(String[] args){
        // 3을 변수 hour의 초기값으로 저장
        int hour = 3;
        // 5를 변수 minute의 초기값으로 저장
        int minute = 5;
        // 3시간 5분 을 출력
        System.out.println(hour + "시간" + minute + "분");

        // (3 * 60) + minute 한 값을 변수 totalMinute의 초기값으로 저장
        int totalMinute = (hour * 60) + minute;
        // 총 185분 을 출력
        System.out.println("총 " + totalMinute + "분");
    }
}