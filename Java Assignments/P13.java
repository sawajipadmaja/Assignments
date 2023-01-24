

import java.util.*;


public class P13 
{
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
	{
		List<Integer> valueList = new ArrayList(hm.values());



		Collections.sort(valueList);   
		HashMap<String, Integer> newHM = new LinkedHashMap<String, Integer>();



		for(Integer i:valueList) 
		{
			for (Map.Entry<String,Integer> entry : hm.entrySet())

				if(entry.getValue() == i) 
				{
					newHM.put(entry.getKey(),entry.getValue());         
				}
		}
		
		return newHM;
	}


	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("ONE", 10);
		hm.put("TWO", 20);
		hm.put("THREE", 30);
		hm.put("FOUR", 40);
		hm.put("FIVE", 50);
		
		HashMap<String, Integer> hm1 = sortByValue(hm);

		for (Map.Entry<String, Integer> en : hm1.entrySet()) 
		{
			System.out.println("Key = " + en.getKey() +
					", Value = " + en.getValue());
		}
	}
}