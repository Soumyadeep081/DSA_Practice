package Tree;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    private static Node insert(Integer[]nums, int i){
        if(i>=nums.length||nums[i]==null)return null;
        Node root=new Node(nums[i]);
        root.left=insert(nums,2*i+1);
        root.right=insert(nums,2*i+2);
        return root;

    }
    public static void main(String[] args) {
        //Path to given node:
        Integer[]nums={1,2,3,4,5};
        Node root=insert(nums,0);

        List<Integer>ll=new ArrayList<>();

        int x=5;
        f(root,x,ll);
        System.out.println(ll);


    }
    public static boolean f(Node root, int x, List<Integer> ll){
        if(root==null)return false;
        ll.add(root.data);
        if(root.data==x)return true;
        boolean lf=f(root.left,x,ll);
        boolean rf=f(root.right,x,ll);
        if(lf||rf)return true;
        ll.removeLast();
        return false;
    }
}
