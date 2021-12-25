// float과 double 타입

package sec02.exam07;

public class FloatDoubleExample{
    public static void main(String[] args){
        // 실수값 저장
        // float var1 = 3.14; <---- 컴파일 에러(Type mismatch)
        // 3.14를 float형 변수 var2의 초기값으로 설정
        float var2 = 3.14f;
        // 3.14를 double형 변수 var3의 초기값으로 설정
        double var3 = 3.14;

        // 정밀도 테스트
        // 0.1234567890123456789를 float형 변수 var4의 초기값으로 설정
        float var4 = 0.1234567890123456789f;
        // 0.1234567890123456789를 double형 변수 var5의 초기값으로 설정
        double var5 = 0.1234567890123456789;

        // 
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5); // <---- double 타입인 var5가 float 타입인 var4보다 2배 이상 정밀한 값으로 출력

        // e 사용하기
        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;
        System.out.pritnln("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.pritnln("var8: " + var8);
    }
}