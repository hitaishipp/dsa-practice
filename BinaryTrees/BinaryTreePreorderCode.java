package BinaryTrees;

public class BinaryTreePreorderCode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static int i = -1;
    public static Node binaryTree(int arr[]){
        i++;
        if(arr[i] == -1){
            return null;
        }
        Node n = new Node(arr[i]);

        n.left = binaryTree(arr);
        n.right = binaryTree(arr);

        return n;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String args[]){
        int nodes[] = {1, 2, -1, -1, 3, -1, -1};
        Node n = binaryTree(nodes);
        preorder(n);
    }
}
