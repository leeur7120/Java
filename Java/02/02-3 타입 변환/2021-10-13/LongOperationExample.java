// 정수 타입의 연산

package sec03.exam04;

public class LongOperationExample{
    public static void main(String[] args){
        // 10을 byte형 변수 value1의 초기값으로 저장
        byte value1 = 10;
        // 100을 int형 변수 value2의 초기값으로 저장
        int value2 = 100;
        // 1000을 long형 변수 value3의 초기값으로 저장
        long value3 = 1000L;
        // 
        long result = value1 + value2 + value3;
        System.out.println(result);
    }
}