package TASK1;

public class matrix {
	public static void main(String[] args) {
        
        int k,i,j;
       k=5;
     
       for(i=k;i>=1;i--)
       {
           for(j=k;j>=1;j--)
           {
               System.out.print(i>j?i:j);         
               
           }
           System.out.println();
       }
    }
}
