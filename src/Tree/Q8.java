package Tree;

public class Q8 {
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
        //124. Binary Tree Maximum Path Sum:
        Integer[]nums={-10,9,20,null,null,15,7};
        Node root=insert(nums,0);

        max=Integer.MIN_VALUE;
        f(root);
        System.out.println(max);


    }
    static int max;
    private static int f(Node root){
        if(root==null)return 0;
        int left=Math.max(0,f(root.left));
        int right=Math.max(0,f(root.right));
        max=Math.max(max,root.data+left+right);
        return root.data+Math.max(left,right);
    }
}
