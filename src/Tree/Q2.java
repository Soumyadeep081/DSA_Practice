package Tree;

import java.util.*;

public class Q2 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    private static Node conBST(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data){
            root.left=conBST(root.left,val);
        }
        else root.right=conBST(root.right,val);
        return root;

    }
    public static void main(String[] args) {
        //BST to GST:
        Integer[]nums={4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        Node root=null;
        for(Integer num:nums){
            if(num!=null) {
                root = conBST(root, num);
            }
        }

        pre=0;
        f(root);

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            System.out.print(node.data+" ");
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);
        }

    }
    static int pre;
    private static void f(Node root){
        if(root==null)return;
        f(root.right);
        pre+=root.data;
        root.data=pre;
        f(root.left);
    }
}
