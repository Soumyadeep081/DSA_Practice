package Tree;

import java.util.*;

public class Q16 {
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
        Integer[]nums={20, 8, 22, 5, 3, 4, 25, null, null, 10, 14, null, null, 28, null};
        Node root=insert(nums,0);

        System.out.println(bottomView(root));
    }
    static class Pair{
        Node node;
        int col;

        Pair(Node node,int col){
            this.node=node;
            this.col=col;
        }
    }
    public static List<Integer> bottomView(Node root) {

        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair p=q.poll();

            Node node=p.node;
            int col=p.col;

            map.put(col,node.data);

            if(node.left!=null)
                q.add(new Pair(node.left,col-1));

            if(node.right!=null)
                q.add(new Pair(node.right,col+1));
        }

        return new ArrayList<>(map.values());

    }
}
