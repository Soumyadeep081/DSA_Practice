package Tree;

import java.util.*;

public class Q19 {
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
        //Print all nodes at a distance of K in BT:

        Integer[]nums={3,5,1,6,2,0,8,null,null,7,4};
        Node root=insert(nums,0);

    }
    static class pair{
        Node node;
        int dist;

        pair(Node node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public static List<Integer> distanceK(Node root, Node target, int k) {

        Map<Node,List<Node>> adj = new HashMap<>();

        buildGraph(root,null,adj);

        Queue<pair> nq = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();

        nq.add(new pair(target,0));
        visited.add(target);

        List<Integer> res = new ArrayList<>();

        while(!nq.isEmpty()){

            pair p = nq.poll();
            Node node = p.node;
            int dist = p.dist;

            if(dist == k) res.add(node.data);

            if(dist > k) break;

            for(Node nbr : adj.get(node)){
                if(!visited.contains(nbr)){
                    visited.add(nbr);
                    nq.add(new pair(nbr,dist+1));
                }
            }
        }

        return res;
    }

    private static void buildGraph(Node node, Node parent, Map<Node,List<Node>> adj){

        if(node == null) return;

        adj.putIfAbsent(node,new ArrayList<>());

        if(parent != null){
            adj.get(node).add(parent);
            adj.get(parent).add(node);
        }

        buildGraph(node.left,node,adj);
        buildGraph(node.right,node,adj);

    }
}
