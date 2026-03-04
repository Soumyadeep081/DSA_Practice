package Tree.Q11;

import java.util.*;

public class sol2 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node insert(Integer[]nums,int i){
        if(i>=nums.length||nums[i]==null)return null;
        Node root=new Node(nums[i]);
        root.left=insert(nums,2*i+1);
        root.right=insert(nums,2*i+2);
        return root;
    }
    public static void main(String[] args) {
        //DFS:
        Integer[]nums={1,2,3,4,null,null,null,5};
        Node root=insert(nums,0);

        List<Integer>res=new ArrayList<>();
        rightSideview(root,res);
        System.out.println(res);

    }
    public static List<Integer> rightSideview(Node root, List<Integer>res){
        if(root==null)return res;
        f(root,res,0);
        return res;
    }
    private static void f(Node root,List<Integer>ll,int lvl){
        if(root==null)return;
        if(ll.size()==lvl)ll.add(root.data);
        f(root.right,ll,lvl+1);
        f(root.left,ll,lvl+1);
    }
}
