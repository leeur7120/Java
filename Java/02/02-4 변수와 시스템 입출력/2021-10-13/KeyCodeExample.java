// 입력된 키코드를 변수에 저장

package sec04.exam02;

public class KeyCodeExample{
    public static void main(String[] args) {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
        
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}