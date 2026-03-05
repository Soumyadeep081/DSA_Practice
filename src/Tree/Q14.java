package Tree;

import java.util.*;

public class Q14 {
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
        //Vertical Order Traversal of a Binary Tree:
        Integer[]nums={1,2,3,4,5,6,7};
        Node root=insert(nums,0);
        List<List<Integer>>res=new ArrayList<>();
        System.out.println(verticalTraversal(root,res));
    }
        static class pair{
            int val;
            int col;
            int row;
            pair(int val,int col,int row){
                this.val=val;
                this.col=col;
                this.row=row;
            }
        }
        public static List<List<Integer>> verticalTraversal(Node root,List<List<Integer>>res) {
            PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->{
                if(a.col!=b.col)return a.col-b.col;
                if(a.row!=b.row)return a.row-b.row;
                return a.val-b.val;
            }
            );
            f(root,0,0,pq);
            int prev=Integer.MIN_VALUE;
            while(!pq.isEmpty()){
                pair p=pq.poll();
                int col=p.col;
                int val=p.val;
                if(prev!=col){
                    res.add(new ArrayList<>());
                    prev=col;
                }
                res.get(res.size()-1).add(val);
            }
            return res;
        }
        private static void f(Node root,int col,int row,PriorityQueue<pair>pq){
            if(root==null)return;
            pq.add(new pair(root.data,col,row));
            f(root.left,col-1,row+1,pq);
            f(root.right,col+1,row+1,pq);
        }
}
