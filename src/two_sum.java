import java.util.HashMap;

class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> new_map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = target-nums[i];
            if(new_map.containsKey(val)){
                ans[0] = new_map.get(val);
                ans[1] = i; 
                break;
            }else{
                new_map.put(nums[i],i);
            }
        } 
        return ans;
    }
}