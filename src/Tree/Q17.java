package Tree;

public class Q17 {
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
        //Symmetric Binary Tree:
        Integer[]nums={1,2,2,3,4,4,3};
        Node root=insert(nums,0);

        System.out.println(f(root));
    }
    public static boolean f(Node root){
        return isMirror(root.left,root.right);
    }
    private static boolean isMirror(Node root1,Node root2){
        if(root1==null&&root2==null)return true;
        if(root1==null||root2==null)return false;

        return root1.data==root2.data&&isMirror(root1.left,root2.right)&&isMirror(root1.right,root2.left);
    }
}
