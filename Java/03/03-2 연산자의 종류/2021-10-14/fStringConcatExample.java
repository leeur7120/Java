// 문자열 결합 연산자

package sec02.exam06;

public class fStringConcatExample {
    public static void main(String[] args) {
        // 문자열 JDK + 숫자 6.0 한 값( JDK6.0 )을 String형 변수 str1의 초기값으로 저장
        String str1 = "JDK" + 6.0;
        // 변수 str1 + 문자열 특징 한 값( JDK6.0 특징 )을 String형 변수 str2의 초기값으로 저장
        String str2 = str1 + " 특징";
        // JDK6.0 특징 을 출력
        System.out.println(str2);

        // 문자열 JDK + 3 + 3.0 한 값( JDK33.0 )을 String형 변수 str3의 초기값으로 저장
        String str3 = "JDK" + 3 + 3.0;
        // 정수 3 + 실수 3.0 + 문자열 JDK 한 값( 6.0JDK )을 String형 변수 str4의 초기값으로 저장
        String str4 = 3 + 3.0 + "JDK";
        // JDK33.0 을 출력
        System.out.println(str3);
        // 6.0JDK 를 출력
        System.out.println(str4);
    }
}