package Tree;

import java.util.*;

public class Q13 {
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
        //Root to Leaf Paths:
        Integer[]nums={10, 20, 30, 40, 60, null, null};
        Node root=insert(nums,0);

        List<List<Integer>>res=new ArrayList<>();
        find(root,new ArrayList<>(),res);
        System.out.println(res);
    }
    public static void find(Node root,List<Integer>ll,List<List<Integer>>res){
        if(root==null)return;
        ll.add(root.data);
        if(root.left==null&&root.right==null){

            res.add(new ArrayList<>(ll));
        }
        else{
            find(root.left,ll,res);
            find(root.right,ll,res);
        }
        ll.removeLast();

    }
}
