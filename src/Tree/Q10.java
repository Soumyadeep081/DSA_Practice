package Tree;

import java.util.*;

public class Q10 {
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
        //Tree Boundary Traversal:
        Integer[]nums={1, 2, 3, 4, 5, 6, 7, null, null, 8, 9, null, null, null, null};
        Node root=insert(nums,0);

        ArrayList<Integer>res=new ArrayList<>();
        boundaryTraversal(root,res);
        System.out.println(res);

    }
   static void boundaryTraversal(Node root, ArrayList<Integer>res) {

        if(root==null)return;

        if(!isLeaf(root))res.add(root.data);
        Left(root.left,res);
        Leaves(root,res);
        Right(root.right,res);

   }
    private static boolean isLeaf(Node root){
        if(root.left==null&&root.right==null)return true;
        return false;
    }
    private static void Left(Node root,ArrayList<Integer>res){
        if(root==null||isLeaf(root))return;
        res.add(root.data);
        if(root.left!=null)Left(root.left,res);
        else if(root.right!=null)Left(root.right,res);

    }
    private static void Right(Node root,ArrayList<Integer>res){
        if(root==null||isLeaf(root))return;
        if(root.right!=null)Right(root.right,res);
        else if(root.left!=null)Right(root.left,res);
        res.add(root.data);
    }
    private static void Leaves(Node root,ArrayList<Integer>res){
        if(root==null)return;
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        Leaves(root.left,res);
        Leaves(root.right,res);
    }
}
