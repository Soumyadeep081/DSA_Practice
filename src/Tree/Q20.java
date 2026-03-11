package Tree;

import java.util.*;

public class Q20 {
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
        //2385. Amount of Time for Binary Tree to Be Infected:
        Integer[]nums={1,5,3,null,4,10,6,9,2};
        Node root=insert(nums,0);

        System.out.println(amountOfTime(root,3));
    }
    static class pair{
        Node node;
        int time;
        pair(Node node,int time){
            this.node=node;
            this.time=time;
        }
    }
    public static int amountOfTime(Node root, int start) {
        Node startNode=find(root,start);;;
        Map<Node,List<Node>>adj=new HashMap<>();
        f(root,null,adj);
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(startNode,0));
        int t=0;
        Set<Node>hs=new HashSet<>();
        hs.add(startNode);
        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.node;
            int time=p.time;
            t=Math.max(t,time);
            for(Node nbr:adj.get(node)){
                if(!hs.contains(nbr)){
                    q.add(new pair(nbr,time+1));
                    hs.add(nbr);
                }
            }
        }
        return t;

    }
    private static Node find(Node root,int start){
        if(root==null)return null;
        if(root.data==start)return root;
        Node left=find(root.left,start);
        if(left!=null)return left;
        return find(root.right,start);
    }
    private static void f(Node root,Node parent,Map<Node,List<Node>>adj){
        if(root==null)return;
        adj.putIfAbsent(root,new ArrayList<>());
        if(parent!=null){
            adj.get(root).add(parent);
            adj.putIfAbsent(parent,new ArrayList<>());
            adj.get(parent).add(root);
        }
        f(root.left,root,adj);
        f(root.right,root,adj);
    }
}
