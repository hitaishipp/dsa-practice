package BinaryTrees;

public class BinaryTreeTraversal {
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
    static int i =-1;
    public static Node binaryTree(int arr[]){
        i++;
        if(arr[i]==-1){
            return null;
        }
        Node n = new Node(arr[i]);

        n.left = binaryTree(arr);
        n.right = binaryTree(arr);

        return n;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
        
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    public static void main(String args[]){
        int arr[] = {1, 2, -1, -1, 3, -1, -1};
        Node n = binaryTree(arr);
        preOrder(n);
        postOrder(n);
        inOrder(n);
    }
}
