package Tree;

public class Q7 {
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
        Integer[]nums={11, 22, 33, 44, 55, 66, 77};
        Node root=insert(nums,0);
        int p=77,q=22;
        Node lca=LCA(root,p,q);
        int x=find(lca,p,0);
        int y=find(lca,q,0);
        System.out.println(x+y);
    }
    private static Node LCA(Node root,int a,int b){
        if(root==null||root.data==a||root.data==b)return root;
        Node left=LCA(root.left,a,b);
        Node right=LCA(root.right,a,b);
        if(left!=null&&right!=null)return root;
        else if(left!=null)return left;
        else return right;

    }
    private static int find(Node root,int a,int c){
        if(root==null)return 0;
        if(root.data==a)return c;
        int left=find(root.left,a,c+1);
        if(left!=0)return left;
        return find(root.right,a,c+1);


    }
}
