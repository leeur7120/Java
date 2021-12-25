// byte 타입 변수

package sec02.exam02;

public class ByteExample{
    public static void main(String[] args){
        // -128을 변수 var1의 초기값으로 저장
        byte var1 = -128;
        // -30을 변수 var2의 초기값으로 저장
        byte var2 = -30;
        // 0을 변수 var3의 초기값으로 저장
        byte var3 = 0;
        // 30을 변수 var4의 초기값으로 저장
        byte var4 = 30;
        // 127을 변수 var5의 초기값으로 저장
        byte var5 = 127;
        // 128을 변수 var6의 초기값으로 저장
        byte var6 = 128; // <--- 컴파일 에러(Type mismatch: cannot convert from int to byte)

        // 
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}