package Section7;
// 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
// 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
// 코딩테스트로 많이 출제 ! for문+배열 vs 재귀

class Main {
    public int DFS(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);
    }
    public static void main(String[] args){
        Main T = new Main();
        int n=10;
        for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
    }
}



// 위 풀이보다 더 효율적인 풀이
// 배열사용! 기록!

import java.util.*;
class Main {
    static int[] fibo;
    public int DFS(int n){
        // 메모이제이션!
        // 해당값이 이미 배열에 담겨 있을시에는 배열에 있는 값 return
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }
    public static void main(String[] args){
        Main T = new Main();
        int n=45;
        fibo=new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}