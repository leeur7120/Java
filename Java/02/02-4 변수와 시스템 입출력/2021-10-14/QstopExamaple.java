// q를 입력하면 반복 종료

package sec04.exam04;

public class QstopExample{
    public static void main(String[] args){
        // int형 변수 keyCode 선언
        int keyCode;

        // 조건식이 true면 무한반복
        while(true){
            // 입력 받은 키코드를 변수 keyCode에 저장
            keyCode = System.in.read();
            // keyCode: ( 입력 받은 키코드 )
            System.out.println("keyCode: " + keyCode);
            // 만약 keyCode가 113(q)와 같으면 ( keyCode가 q이면 ) 실행
            if (keyCode == 113){
                // while문 종료
                break;
            }
        }
        
        // 종료 를 출력
        System.out.println("종료");
    }
}