public class spiralMatrix {
    public static void spiralTraverse(int[][] arr){
        int top=0,left=0;
        int bottom=arr.length-1,right=arr[0].length - 1;
        while(left <= right && top <= bottom){
            // left to right
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // top to bottom
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // right to left
            if(top <= bottom){  
                for(int i = right; i >= left; i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--; 
            }

            // bottom to top
            if(left <= right){  
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++; 
            }
        }

        
     }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralTraverse(arr);
    }
}
