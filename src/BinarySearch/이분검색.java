package BinarySearch;
import java.util.*;
//임의의 N개의 숫자가 입력으로 주어집니다.
// N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
// 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요.
// 단 중복값은 존재하지 않습니다.
public class 이분검색 {
    public int solution(int n, int m, int[] arr){
        int answer=0;
        //정렬
        Arrays.sort(arr);
        int low=0, high=n-1;
        // low가 high 값이 될 때까지 위 단계를 반복
        while(low<=high){
            // low 와 high 값으로 mid 값을 설정
            int mid=(low+high)/2;
            // 값을 찾았으므로 array[mid]값을 리턴
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            //찾으려는 값이 mid 값보다 작으면 high 를 mid -1 로 설정
            if(arr[mid]>m) high=mid-1;
            //찾으려는 값이 mid 값보다 크면 low 를 mid+1 로 설정
            else low=mid+1;
        }
        return answer;
    }
    public static void main(String[] args){
        이분검색 T = new 이분검색();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
