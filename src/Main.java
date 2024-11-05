import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];
        int sum = 0;

        for(int i = 0; i< 9; i++){ //9개의 수 모두  더하고 리스트에 저장하기 위한 배열 생성 앞쪽에

            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += arr[i]; // 9개의 수 더한값 리스트 저장

        }
        Arrays.sort(arr); //키 데이터 저장된 값 오름차순 배열

        // 100을 넘기는 2명을 찾아서 빼줘야 함.. 어떻게? 이중 for문 사용
        // 총합에서 빼줘야 함
        int fake1 = 0,fake2=0;
        for(int a=0; a<arr.length; a++){
            for(int b= a +1; b<arr.length; b++){
                if(sum - arr[a] - arr[b] == 100){
                    fake1 = arr[a];
                    fake2 = arr[b];
                }
            }
        }
        for (int i = 0; i<arr.length; i++) {
            if(fake1 == arr[i] || fake2 == arr[i]) continue;
            System.out.println(arr[i]);
        }

    }
}
