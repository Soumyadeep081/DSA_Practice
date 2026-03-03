package Tree;

import java.util.*;

public class Q9 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node insert(Integer[]nums, int i){
        if(i>=nums.length||nums[i]==null)return null;
        Node root=new Node(nums[i]);
        root.left=insert(nums,2*i+1);
        root.right=insert(nums,2*i+2);
        return root;
    }
    public static void main(String[] args) {
        //103. Binary Tree Zigzag Level Order Traversal:
        Integer[]nums={3,9,20,null,null,15,7};
        Node root=insert(nums,0);

        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return;

        Queue<Node>q=new LinkedList<>();
        q.add(root);

        boolean left=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                if(left)ll.addFirst(node.data);
                else ll.addLast(node.data);

                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);

            }
            left=!left;
            res.add(new ArrayList<>(ll));
        }

        System.out.println(res);

    }
}
