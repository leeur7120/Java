// 정수 리터럴

package sec02.exam01;

public class IntegerLiteralExample{
    public static void main(String[] args){
        int var1 = 0b1011;      // 2진수
        int var2 = 0206;        // 8진수
        // 365를 변수 var3의 초기값으로 저장
        int var3 = 365;         // 10진수
        int var4 = 0xB3;        // 16진수

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.pritnln("var4: " + var4);
    }
}