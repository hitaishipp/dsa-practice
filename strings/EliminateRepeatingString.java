public class EliminateRepeatingString {
    public static void shortenString(String str,int n,StringBuilder strNew,boolean map[]){
        
        if(n==str.length()){
            System.out.print(strNew);
            return;
        }
        if(map[str.charAt(n)-'a']==true){
            shortenString(str,n+1,strNew,map);
        }
        else{
            map[str.charAt(n)-'a']=true;
            strNew.append(str.charAt(n));
            shortenString(str,n+1,strNew,map);
        }
    }
    public static void main(String args[]){
        String str = "ilovecoding";
        shortenString(str,0,new StringBuilder(""),new boolean[26]);
    }
}
