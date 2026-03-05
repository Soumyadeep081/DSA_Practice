package Tree;

import java.util.*;


public class Q15 {
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
        //Top View of BT:
        Integer[]nums={10, 20, 30, 40, 60, 90, 100};
        Node root=insert(nums,0);

        List<Integer>res=new ArrayList<>();
        f(root,res);
        System.out.println(res);
    }
    static class pair{
        Node root;
        int dis;
        pair(Node root,int dis){
            this.root=root;
            this.dis=dis;
        }
    }
    public static List<Integer>f(Node root,List<Integer>res){
        if(root==null)return res;
        Queue<pair>q=new LinkedList<>();
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.root;
            int dis=p.dis;

            if(!mp.containsKey(dis)){
                mp.put(dis,node.data);
            }
            if(node.left!=null)q.add(new pair(node.left,dis-1));
            if(node.right!=null)q.add(new pair(node.right,dis+1));
        }

        for(int val:mp.values())res.add(val);
        return res;
    }
}
