package Section7;
// 자연수 N이 입력되면 재쉬함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.

// 재귀함수란?
// 자기자신을 호출하는 함수
// 반복문의 형태를 지님
// 스택 사용 백트래킹

class Main {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        Main T = new Main();
        T.solution(3);
        //System.out.println(T.solution(3));
    }
}