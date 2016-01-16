/**
 * 
 */
package inxite_elijahhezekiah_interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author elijahhezekiah
 *@Description Class maps String numbers
 *to corresponding integers and returns 
 *a sum  
 */
public class inxite_mapping_searching 
{
	public HashMap<String,Integer> unit_numbers = new HashMap<String,Integer>();
	public StringBuilder Builds_String = new StringBuilder();
	public static  String [] numberString = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten","eleven","twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
            ,"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
            ,"hundred","thousand","million","billion","trillion"
	        };
	
    public static String [] numberFound = {};
	 
 	/**
	 * @param args
 	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
	    //getNumbers(Creates_String());
		//stringReplacer(Creates_String());
		//matchString(Creates_String());
	   storeStrings();
		
	}
	
	public static void storeStrings() throws FileNotFoundException
	{
		File inputFile = new File ("src/input.txt");
		Scanner myScanner = new Scanner(inputFile);
		String currentNumber = "";
		String currentWord ="";
		while (myScanner.hasNext())
		{
			currentNumber = " ";
			Boolean found = true;
			currentWord = myScanner.next().toLowerCase();
			currentWord = replacePunctuation(currentWord).toLowerCase();
			
			for(int i = 0; i < numberString.length; i++)
			{
			 
			  if(currentWord.equalsIgnoreCase(numberString[i]))
			  {
				currentWord = numberString[i];
				currentNumber += currentWord + " ";
			    System.out.println(currentNumber);
			  }
			
		   }
			
		   
		  }
		
	} 
	public static String replacePunctuation(String Words)
	{
		return Words = Words.replaceAll("[\\[\\](){},.;!?<>%]","");
	}
	
	public Integer mapsUnitNumbers(String Number)
	{
		unit_numbers.put("one", 1);
		unit_numbers.put("a", 1);
		unit_numbers.put("two", 2);
		unit_numbers.put("three", 3);
		unit_numbers.put("four", 4);
		unit_numbers.put("five", 5);
		unit_numbers.put("six", 6);
		unit_numbers.put("seven", 7);
		unit_numbers.put("eight", 8);
		unit_numbers.put("nine", 9);
		unit_numbers.put("ten", 10);
		
		return unit_numbers.get(Number);
		
	}
	
	public static String Creates_String() 
	{
		String words = ("Just remember that you're standing on a planet that's evolving"
				     +" And revolving at nine hundred miles an hour,"
				     +" That's orbiting at nineteen miles a second, so it's reckoned,"
				    + " A sun that is the source of all our power."
				   + " The sun and you and me and all the stars that we can see"
				+   " Are moving at a million miles a day,"
				 + " In an outer spiral arm, at forty thousand miles an hour,"
				+ " Of the galaxy we call the 'Milky Way'."
				+" Our galaxy itself contains a hundred billion stars."
				+" It's a hundred thousand light years side to side."
				+" It bulges in the middle, sixteen thousand light years thick,"
				+" But out by us, it's just three thousand light years wide"
				+" We're thirty thousand light years from galactic central point."
				+" We go 'round every two hundred million years,"
				+" And our galaxy is only one of millions of billions "
				+" In this amazing and expanding universe. "
				+" The universe itself keeps on expanding and expanding "
				+" In all of the directions it can whizz "
				+" As fast as it can go, at the speed of light, you know,"
				+" Twelve million miles a minute, and that's the fastest speed there is."
				+" So remember, when you're feeling very small and insecure,"
				+" How amazingly unlikely is your birth, "
				+" And pray that there's intelligent life somewhere up in space,"
				+" 'Cause there's bugger all down here on Earth." ) ;
		return words;
		
	}
	
	public static void stringReplacer (String words) 
	{  
		   	
		String [] words_split = words.trim().split("(?=[,.])|\\s+");
		for(int i=0;i<words_split.length;i++){
			   boolean found = false;
			   for(int j=0;j<numberString.length;j++){
			      if((words_split[i].equalsIgnoreCase(numberString[j]))){
			         found = true;
			         break;
			      }
			   }

			   if (found) 
			   {
				   System.out.println(words_split[i]);
			 }
		
		}
	}
public static void getNumbers(String words)
{
	while(!(words.isEmpty()))
	{
		for(int k = 0; k < numberString.length; k++ ) 
		{
			if(words.equalsIgnoreCase(numberString[k]))
			{
				System.out.println(words);
			}
		}
	}
}



public static void matchString(String words)
{ 
	//(?)(\\sa\\s(hundred|thousand|million|billion|trillion)) \\s"+"two"+"\\shundred\\smillion\\s 
	String Number = " ";
	String Magnitude ="a";
	for(int k = 0; k < numberString.length; k++ ) 
	{
	 Number = numberString[k];		

	  Pattern find_numb = Pattern.compile("((?i)(\\s"+Number+"\\s(?!hundred|thousand|million|billion|trillion"+"\\s))|"
	  		                             +"(?i)(\\s+"+Number+"\\s+(hundred|thousand|million|billion|trillion)"+"\\s+)+)");
	  // group matches 
	  
	  Matcher match_numb = find_numb.matcher(words);
	  
	  //Pattern p= Pattern.compile(Number+"(.*)" );
	  //Matcher matchMagnitudes= p.matcher(words);
	
	while(match_numb.find())
	{
		
	//while (matchMagnitudes.find()) 
	//{
	  String matche_search = match_numb.group(1).trim();
	  //String matched= matchMagnitudes.group(1).trim();
	  //String [] matchedArray = matched.split("");
	  int s = 0;
	  //for(int i = 0; i == numberFound.length; i++)
	  //{   
		
	  System.out.println("i matched"+" "+ matche_search );
	  //concatenate string at i 
	 //} 
	  
	 }
	
  } 
	//}
		
}
	/**
	 *   boolean found = false;
		  numberFound[i] = matche_search;
		  break;
	  for(s = 0; s == matchedArray.length; s++) 
	  {	   
		 
		
		  if(matchedArray[1].equalsIgnoreCase("hundred"))
		  {   
			  found = true;
			  break; 
		  }
	    
	     
	  }
	     if(found)
	     {
	    	 numberFound[i]+=matchedArray[s];
	     }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * for (String s: number_string) 
			{            
		        //Do your stuff here 
			}  // System.out.println(s); 
		     
			  if(!(p.equals(s)))
			 {
				  System.out.println(p);
			  }
			  
			  List<String> number_string_Arraylist = Arrays.asList(number_string);
		
		for (String s: number_string)
		{
			if(!(number_string_Arraylist.contains(s)))
			 {
				  System.out.println(s);
			  }
			
		}
		
		for(int j=0;j<number_string.length;j++){
			if((s.equalsIgnoreCase(number_string[j])))
			 {
				found = true;
		         break;
				
			 }
			}
		if (found) 
		{
			System.out.println(s);
			 
		 } 
		  
		}
		  
		  for (String s: words_split) 
		{      	 
			boolean found = false;
		
		for (String p: number_string) 
		{           
	     
		  if((s.equalsIgnoreCase(p)))
		 {
			  found = true;
			  break;
		  }
		  
		}
		 
		
		 System.out.println(s);
		 
	    }
	 */

 
}
