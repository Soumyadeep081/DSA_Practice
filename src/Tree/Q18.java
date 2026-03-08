package Tree;

public class Q18 {
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
        //Children Sum in a Binary Tree:
        Integer[]nums={35, 20, 15, 15, 5, 10, 5};
        Node root=insert(nums,0);

        System.out.println(f(root));
    }
    public static boolean f(Node root){
        if(root==null||(root.left==null&&root.right==null))return true;
        int s=0;
        if(root.left!=null)s+=root.left.data;
        if(root.right!=null)s+=root.right.data;

        return s==root.data&&f(root.left)&&f(root.right);
    }
}
