import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	
	/* Project: Lab 2: Git
	* Class: UniqueWords.java
	* Author: Anthony Vallejo
	* Date: February 27, 2025
	* counts the number of unique strings in a list
	* @param list ArrayList of strings to be examined
	* @return number of unique strings in the list
	*/
	
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  int wordMatch; 
	  
      for (int i = 0; i < list.size(); i++)
      {		 
    	  wordMatch = 0;
    	  for (int j = 0; j < list.size(); j++)
    	  {
			if (list.get(i).equals(list.get(j))) //if the current word is found in the list, increment the wordMatch variable
			{
				wordMatch++;
			}
		 }
      
      	if (wordMatch == 1) //if the word is found exactly once, then it increments the unique word counter
      	{
      		count++;
      	}
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
