// 키보드에서 입력된 내용을 문자열로 얻기

package sec04.exam05;

public class ScannerExample {
    public static void main(String[] args) {
        // 입력 받은 문자열을 Scanner형 변수 scanner의 초기값으로 저장
        Scanner scanner = new Scanner(System.in);
        // String형 변수 inputData 선언
        String inputData;

        // 조건식이 true면 무한반복
        while(true) {
            // Enter를 치기 전까지 입력 받은 문자열을 intputData에 저장
            inputData = scanner.nextLine();
            // 입력된 문자열: "( 입력 받은 문자열 )"
            System.out.println("입력된 문자열: \"" +  inputData + "\"");
            // 만약 intputData와 문자열 q를 비교해서 같으면 실행
            if (inputData.equals("q")) {
                // while문 종료
                break;
            }
        }

        // 종료 를 출력
        System.out.println("종료");
    }
}