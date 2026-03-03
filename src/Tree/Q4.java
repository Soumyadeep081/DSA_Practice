package Tree;

import java.util.*;

public class Q4 {
    static class Node{
        int data;
        Node left,right,next;
        Node(int data){
            this.data=data;
            this.left=this.right=this.next=null;
        }
    }
    private static Node insert(Integer[]nums, int i){
        if(i>=nums.length||nums[i]==null)return null;
        Node root=new Node(nums[i]);
        root.left=insert(nums,2*i+1);
        root.right=insert(nums,2*i+2);
        return root;

    }
    static class pair{
        Node root;
        int level;
        pair(Node root,int level){
            this.root=root;
            this.level=level;
        }
    }
    public static void main(String[] args) {
        //116. Populating Next Right Pointers in Each Node:
        Integer[]nums={1,2,3,4,5,6,7};
        Node root=insert(nums,0);

        root=connect(root);


    }
    public static Node connect(Node root) {
        if(root==null)return null;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.root;
            int lvl=p.level;
            if(!q.isEmpty()&&lvl==q.peek().level){
                node.next=q.peek().root;
            }
            if(node.left!=null)q.add(new pair(node.left,lvl+1));
            if(node.right!=null)q.add(new pair(node.right,lvl+1));
        }
        return root;
    }
}
