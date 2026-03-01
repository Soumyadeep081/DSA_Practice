package Tree;

public class Q1 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    private static Node insert(Integer[]nums,int i){
        if(i>=nums.length||nums[i]==null)return null;
        Node root=new Node(nums[i]);
        root.left=insert(nums,2*i+1);
        root.right=insert(nums,2*i+2);
        return root;

    }
    public static void main(String[] args) {
        //543. Diameter of Binary Tree:
        Integer[]nums={1,2,3,4,5};
        Node root=insert(nums,0);


        System.out.println(findDiameter(root));
    }
    public static int findDiameter(Node root){
        res=0;
        f(root);
        return res;
    }
    static int res;
    private static int f(Node root){
        if(root==null)return 0;
        int left=f(root.left);
        int right=f(root.right);
        res=Math.max(res,left+right);
        return Math.max(left,right)+1;
    }
}
