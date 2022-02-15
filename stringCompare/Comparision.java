package stringCompare;

import org.junit.Test;

public class Comparision 
{
	
	@Test
	public void stringCompare()
	{
	String[] Stringname = new String[5];  // array for string
	Stringname[0]= "good";    //string at first position
	Stringname[1]= "nice";
	Stringname[2]= "fantastic";
	Stringname[3]= "cool";
	Stringname[4]= "awesome";
	
	int len = Stringname[2].length();  //finding length of string
	for(int i=0;i<5;i++)
	{
		int lengString=Stringname[i].length();
		if(len==lengString)  //comparing length
		{
			if(Stringname[i]=="fantastic"){
				System.out.println("String Matched");
			}
			else
				System.out.println("String does not matches");
		}
	}
	

}
}
