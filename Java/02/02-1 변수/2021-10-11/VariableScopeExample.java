// 변수의 사용 범위

package sec01.exam04;

public class VariableScopeExample{
    public static void main(String[] args){
        // 15를 변수 v1의 초기값으로 저장
        int v1 = 15;
        // 만약 v1(15)가 10보다 크면
        if(v1 > 10){
            // 변수 v2를 선언
            int v2;
            // 변수 v2에 v1(15) - 10을 수행
            v2 = v1 - 10;
        }
        // v1 + v2 + 5 한 값을 v3에 저장
        int v3 = v1 + v2 + 5; // v2  변수를 사용할 수 없기 때문에 컴파일 에러 발생
    }
}