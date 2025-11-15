public class rainwaterTrapII{
    public static int trap(int[] height) {
      if (height == null || height.length == 0) return 0;
  
      int area=0;
      int lmax[]=new int[height.length];
      int rmax[]=new int[height.length];
      lmax[0]=height[0];
      rmax[height.length-1]=height[height.length-1];
     
      for(int i=1;i<height.length;i++){
         lmax[i]=Math.max(lmax[i-1],height[i]);
      } 
      for(int i=height.length-2;i>=0;i--){
         rmax[i]=Math.max(rmax[i+1],height[i]);
      }
      for(int i=0;i<height.length;i++){
        area+=Math.min(lmax[i],rmax[i])-height[i] ;
      } 
      return area;
    }
    public static void main(String args[]){
       int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
       int area=trap(height);
       System.out.print("the area covered by water is "+area);
    }
}