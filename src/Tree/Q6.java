package Tree;

public class Q6 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    private static Node conBST(Node root, int val){
        if(root==null)return new Node(val);
        if(val<root.data){
            root.left=conBST(root.left,val);
        }
        else root.right=conBST(root.right,val);
        return root;

    }
    public static void main(String[] args) {
        //Lowest Common Ancestor of a Binary Search Tree:
        Integer[]nums={6,2,8,0,4,7,9,null,null,3,5};
        Node root=null;
        for(Integer num:nums){
            if(num!=null) root=conBST(root,num);
        }

        int p=2,q=4;

        root=f(root,p,q);
        System.out.println(root.data);

    }
    private static Node f(Node root,int p,int q){
        if(p<root.data&&q<root.data)return f(root.left,p,q);
        if(p>root.data&&q>root.data)return f(root.right,p,q);
        return root;
    }
}
