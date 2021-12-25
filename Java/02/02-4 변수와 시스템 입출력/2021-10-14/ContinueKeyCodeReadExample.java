// 입력된 키의 개수와 상관없이 키코드 일기

package sec04.exam03;

public class ContinueKeyCodeReadExample{
    public static void main(String[] args){
        // int형 변수 keyCode를 선언
        int keyCode;

        // 조건식이 true면 무한반복
        while(true){
            // 입력 받은 키코드를 변수 keyCode에 저장
            keyCode = System.in.read();
            // keyCode: ( 입력 받은 키코드 )
            System.out.println("keyCode: " + keyCode);
        }
    }
}