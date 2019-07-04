import java.util.*;
public class StringTest {

	public static void main(String[] args) {
	
		String string="Hello World";
		
		char ch[]=new char[string.length()];
		for(int i=0;i<string.length();i++)
			
		{
			ch[i]=string.charAt(i);
			
		}
		 
		System.out.println(ch);
		
		for(int i=0;i<string.length();i++)
		{
			System.out.println(ch[i]);
		}
		for(char c:ch)
		{
			System.out.println(c);
		}
	}

}
