// char 타입

package sec02.exam04;

public class CharExample{
    public static void main(String[] args){
        // 단일문자 'A'를 변수 c1의 초기값으로 저장
        char c1 = 'A';
        // 단일문자 'A'를 변수 c2의 초기값으로 저장 (A의 아스키코드값: 65)
        char c2 = 65;
        // 
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}