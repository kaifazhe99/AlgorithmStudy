package Section7;
// 10진수 N이 입력되면 2진수로 변환하려 출력하는 프로그램을 작성하세요.

import java.util.*;
class Main {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        Main T = new Main();
        T.solution(11);
        //System.out.println(T.solution(3));
    }
}
