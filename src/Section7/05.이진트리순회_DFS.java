package Section7;

class Node{
    int data;
    Node lt, rt; // Node라는 클래스의 객체주소를 저장
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Main{
    Node root;
    public void DFS(Node root){
        if(root==null)
            return;
        else{
            // 전위순회
            System.out.print(root.data+" ");
            DFS(root.lt);
            // 중위순회
            System.out.print(root.data+" ");
            DFS(root.rt);
            // 후위순회
        }
    }

    public static void main(String args[]) {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}