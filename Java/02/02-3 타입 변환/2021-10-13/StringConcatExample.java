// 문자열 결합 연산

package sec03.exam06;

public class StringConcatexample{
    public static void main(String[] args){
        // 숫자 연산
        // 10 + 2 + 8한 값( 정수 20 )을 int형 변수 value의 초기값으로 저장
        int value = 10 + 2 + 8;
        // value: 20 을 출력
        System.out.println("value: " + value);

        // 문자열 결합 연산
        // 10 + 2 + "8"한 값( 문자열 128 )을 String형 변수 str1의 초기값으로 저장
        String str1 = 10 + 2 + "8";
        // str1: 128 을 출력
        System.out.println("str1: " + str1);

        // 10 + "2" + 8한 값( 문자열 1028 )을 String형 변수 str2의 초기값으로 저장
        String str2 = 10 + "2" + 8;
        // str2: 1028 을 출력
        System.out.println("str2: " + str2);

        // "10" + 2 + 8한 값( 문자열 1028 )을 String형 변수 str3의 초기값으로 저장
        String str3 = "10" + 2 + 8;
        // str3: 1028 을 출력
        System.out.println("str3: " + str3);

        // "10" + ( 2 + 8 )한 값( 문자열 1010 )을 String형 변수 str4의 초기값으로 저장
        String str4 = "10" + (2 + 8);
        // str4: 1010 을 출력
        System.out.println("str4: " + str4);
    }
}