// 입력된 키코드를 변수에 저장

package sec04.exam02;

public class KeyCodeExample{
    public static void main(String[] args) {
        // int형 변수 keyCode를 선언
        int keyCode;

        // 입력 받은 키코드를 변수 keyCode에 저장
        keyCode = System.in.read();
        // keyCode: ( 입력 받은 키코드 )
        System.out.println("keyCode: " + keyCode);

        // 입력 받은 키코드를 변수 keyCode에 저장
        keyCode = System.in.read();
        // keyCode: ( 입력 받은 키코드 )
        System.out.println("keyCode: " + keyCode);
        
        // 입력 받은 키코드를 변수 keyCode에 저장
        keyCode = System.in.read();
        // keyCode: ( 입력 받은 키코드 )
        System.out.println("keyCode: " + keyCode);
    }
}