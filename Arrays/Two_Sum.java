import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	
	public int[] twoSum(int[] nums, int target) {
		 Map<Integer,Integer> hash_map = new HashMap<>();
		 
		    for(int i = 0; i<nums.length;i++){
		        int complement = target - nums[i];
		        
		        if(hash_map.containsKey(complement)){
		        	
		        	int[] output = new int[] {hash_map.get(complement), i};
		        	System.out.println(hash_map.get(complement) + "  "+ i);
		        
		            return output;
		        }
		        hash_map.put(nums[i],i);
		        
		    }
		    
		    throw new IllegalArgumentException("no match found");
		    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Two_Sum ts = new Two_Sum();
		
		int[] arr = {2,7,11,15};
		int target = 9 ; 
		
		int[] val = ts.twoSum(arr, target);
		System.out.println(val);

	}

}
