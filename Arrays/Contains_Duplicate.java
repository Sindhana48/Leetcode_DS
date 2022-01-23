import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
	
	 public boolean containsDuplicate(int[] nums) {
		 
		Set <Integer> hashset = new HashSet<Integer>();
		
		//Start with empty hash map, check for duplicate, else add it to the map for future reference.
		//Time : O(n), Space : O(n)
		
		for(int n: nums) {
			
			if (hashset.contains(n)) {
				return true;
			}
			else
				hashset.add(n);
		}	 
		 
		return false;
		 
		 
	     
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contains_Duplicate cd = new Contains_Duplicate();
		
		int[] arr = {1,2,3,4,5,2,3,4};
		
		boolean val = cd.containsDuplicate(arr); 
		System.out.println(val);

	}

}
