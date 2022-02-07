import java.util.Scanner;
public class NewSort
{
	public static void merge(int a[],int l,int m,int h)
   {  
       int i, j,c=l;
       int b[]=new int[h+1];
 
	for(i = l,j = m+1; i<=m && j<=h; c++)
             {
 
                  if(a[i] <= a[j])
                  b[c] = a[i++];
                 else
                 b[c] = a[j++];
      	}
	 while(i <= m )    
                 b[c++] = a[i++];
 
               while(j<=h)   
                 b[c++] = a[j++];
          
   	 for(i = l ; i <= h; i++)
                        a[i] = b[i];
   } 
  
   public static void Sort(int a[],int l,int h)
   {  
         if(l<h)
        {
           int m=(l+h)/2;
           Sort(a,l,m);
           Sort(a,m+1,h);
           merge(a,l,m,h);
 
         } 
          
   
   }  
 
 public static void printarray(int a[])
{
       for(int i=0; i < a.length; i++)
        {
        
        System.out.print(a[i]+"  ");
        }
       
}
    public static void main(String[] args) 
    {
        int ns,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:- ");
        ns = s.nextInt();
        int a[] = new int[ns];
        System.out.println("Enter "+ns+" elements:-  ");
        for( i=0; i < ns; i++)
        {
            a[i] = s.nextInt();
        }
 
        System.out.println( "Elements in array:-  ");
        printarray(a);
         Sort(a,0,ns-1);
        System.out.println( "\nElements after sorting:- ");
         printarray(a);
       
  }
 
  
    
       
}