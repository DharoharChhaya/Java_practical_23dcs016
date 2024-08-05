import java.util.Scanner;

class duplicate
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=s.nextLine();
		int i,j,count=0;
		char str[]=s1.toCharArray();
		System.out.println("The duplicate characters are: ");
		for(i=0;i<str.length;i++)
		{
			count=1;
			for(j = i+1;j <str.length;j++) 
			{  
                                  if(str[i] == str[j] && str[i] != ' ') 
		           {  
                                          count++;    
                                          str[j] = '0';  
                                  }  
                       }  
              
                    if(count > 1 && str[i] != '0')
	        {
                            System.out.println(str[i]+" appears "+count+" times "); 
				
	        }				
            }  
     }
}
