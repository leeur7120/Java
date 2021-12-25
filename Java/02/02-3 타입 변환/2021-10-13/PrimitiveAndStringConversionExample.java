// 기본 타입과 문자열 간의 변환

// package sec03.exam07;

public class PrimitiveAndStringConversionExample{
    public static void main(String[] args){
        // 정수 10을 문자열 10으로 변환해 int형 변수 value1의 초기값으로 저장
        int value1 = Integer.parseInt("10");
        // 실수 3.14를 문자열 3.14로 변환해 double형 변수 value2의 초기값으로 저장
        double value2 = Double.parseDouble("3.14");
        // 불 true를 문자열 true로 변환해 boolean형 변수 value3의 초기값으로 저장
        boolean value3 = Boolean.parseBoolean("true");

        // value1: 10 을 출력
        System.out.println("value1: " + value1);
        // value2: 3.14 를 출력
        System.out.println("value2: " + value2);
        // value3: true 를 출력
        System.out.println("value3: " + value3);

        // 정수 10을 문자열 10으로 변환해 String형 변수 str1의 초기값으로 저장
        String str1 = String.valueOf(10);
        // 실수 3.14를 문자열 3.14로 변환해 String형 변수 str2의 초기값으로 저장
        String str2 = String.valueOf(3.14);
        // 불 true를 문자열 true로 변환해 String형 변수 str3의 초기값으로 저장
        String str3 = String.valueOf(true);

        // str1: 10 을 출력
        System.out.println("str1: " + str1);
        // str2: 3.14 를 출력
        System.out.println("str2: " + str2);
        // str3: true 를 출력
        System.out.println("str3: " + str3);
    }
}