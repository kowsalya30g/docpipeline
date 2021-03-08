import java.util.Scanner;
public class SortString {
	private static Scanner input=new Scanner(System.in); 
	public static void main(String[] args)
	{
		String givenString;
		givenString=input.next();
		char[] chars=new char[givenString.length()];
		int k=0,j;
		char temp;
		for(int i=0;i<givenString.length();i++)
		{
			chars[i]=givenString.charAt(i);
			k++;
		}                                           
		for(int i=1;i<k;i++)
		{
			j=i;
			while(j>0&&chars[j]<chars[j-1])
			{
					temp=chars[j-1];
					chars[j-1]=chars[j];
					chars[j]=temp;
					j--;
			}
				
			}
		int li=0,hi=chars.length,mi;
		mi=(li+hi)/2;
		while(li<=hi)
		{
			if(chars[mi]=='e')
			{
				System.out.println("it is found at"+mi);
				break;
			}
			else if(chars[mi]>'e')
			{
				hi=mi-1;
			}
			else
			{
				li=mi+1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("not found");
		}
		
		/*for(int i=0;i<k;i++)
		{
			System.out.print(chars[i]);
		}*/
	}

}
