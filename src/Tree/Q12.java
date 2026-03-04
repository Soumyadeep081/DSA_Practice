package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Q12 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node conBST(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data)root.left=conBST(root.left,val);
        else root.right=conBST(root.right,val);
        return root;
    }
    public static void main(String[] args) {
        //insert into BST:
        Integer[]nums={4,2,7,1,3};
        Node root=null;
        for(int num:nums){
            root=conBST(root,num);
        }
        int val=5;

        root=f(root,val);

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            System.out.print(node.data+" ");
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);
        }


    }
    private static Node f(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data)root.left=f(root.left,val);
        else root.right=f(root.right,val);
        return root;
    }
}
