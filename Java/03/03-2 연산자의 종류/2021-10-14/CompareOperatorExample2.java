// 비교 연산자

package sec02.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); // true
        
        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); // flase
        System.out.println((float)v4 == v5); // true
    }
}