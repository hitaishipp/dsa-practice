public class ContainerWithMostWater {
   
    public static int maxArea(int[] height) {
        int i = 0;
        int j =height.length-1;
        int area;
        int max = 0;
        while(i<j){
            
            if(height[i]<=height[j]){
                area = height[i]*(j-i);
                i++;
            }
            else{
                area = height[j]*(j-i);
                j--;
            }
            max = Math.max(max,area);
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
}

