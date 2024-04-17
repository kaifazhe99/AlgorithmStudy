package 백준_fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int count(int[] disArr, int K) {
        Arrays.sort(disArr);
        int low = 0;
        int high = disArr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = ((high + low) / 2);
            if (disArr[mid] < K) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();

        int[] disArr = Arrays.stream(arr).distinct().toArray();


        for (int i = 0; i < arr.length; i++) {
            sb.append(count(disArr, arr[i]) + " ");
        }
        String result = sb.toString();

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());


        System.out.println(T.solution(arr));


    }
}
