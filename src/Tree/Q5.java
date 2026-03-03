package Tree;

public class Q5 {
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
        //236. Lowest Common Ancestor of a Binary Tree:
        Integer[]nums={3,5,1,6,2,0,8,null,null,7,4};
        Node root=insert(nums,0);

        root=lowestCommonAncestor(root,7,4);
        System.out.println(root.data);

    }
    public static Node lowestCommonAncestor(Node root, int p, int q) {
        if(root==null||root.data==p||root.data==q)return root;
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);

        if(left!=null&&right!=null)return root;
        else if(left!=null)return left;
        else return right;
    }
}
