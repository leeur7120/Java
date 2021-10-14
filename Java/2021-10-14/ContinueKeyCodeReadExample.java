// 입력된 키의 개수와 상관없이 키코드 일기

package sec04.exam03;

public class ContinueKeyCodeReadExample{
    public static void main(String[] args){
        int keyCode;

        while(true){
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }
}