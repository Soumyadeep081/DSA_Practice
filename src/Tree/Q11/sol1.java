package Tree.Q11;


import java.util.*;

public class sol1 {
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
        //BFS:

        Integer[]nums={1,2,3,4,null,null,null,5};
        Node root=insert(nums,0);

        List<Integer>res=new ArrayList<>();
        rightSideView(root,res);
        System.out.println(res);

    }
    static class pair{
        Node node;
        int lvl;
        pair(Node node,int lvl){
            this.node=node;
            this.lvl=lvl;
        }
    }
    public static List<Integer> rightSideView(Node root,List<Integer>res) {
        if(root==null)return res;
        HashSet<Integer>hs=new HashSet<>();
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(root,0));

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                pair p=q.poll();
                Node node=p.node;
                int lvl=p.lvl;
                if(!hs.contains(lvl)){
                    res.add(node.data);
                    hs.add(lvl);
                }
                if(node.right!=null)q.add(new pair(node.right,lvl+1));
                if(node.left!=null)q.add(new pair(node.left,lvl+1));
            }
        }
        return res;
    }
}
