import java.util.HashMap;

public class OccurenceCount {
String inputString;
	public  void characterCount(String inputString)
	{
		this.inputString=inputString.toLowerCase();
	char ch[]=this.inputString.toCharArray();
	HashMap<Character,Integer> charmapcount=new HashMap<Character,Integer>();
	for(char c:ch)
	{
 
		if(charmapcount.containsKey(c))
		{
			charmapcount.put(c, charmapcount.get(c)+1);
			
		}
		else
		{
			charmapcount.put(c, 1);	 	 	
			
		}
		
	}
	
	System.out.println(charmapcount);

	
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	
	{
		OccurenceCount ch=new OccurenceCount();
		//ch.characterCount("ssd");
	ch.characterCount("Hello I am Piyush");
	
		
	}

}
