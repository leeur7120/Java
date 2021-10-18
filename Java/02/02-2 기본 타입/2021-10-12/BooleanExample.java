// boolean 타입

package sec02.exam08;

public class BooleanExample{
    public static void main(String[] args){
        // 불 true를 변수 stop의 초기값으로 저장
        boolean stop = true;
        // 만약 변수 stop이 불 true라면
        if (stop){
            // 중지합니다. 를 출력
            System.out.println("중지합니다.");
        // 아니면
        } else{
            // 시작합니다. 를 출력
            System.out.println("시작합니다.");
        }
    }
}