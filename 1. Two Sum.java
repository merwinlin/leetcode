import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <= 0){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();//<value,index>
        for(int i=0; i< nums.length; i++){
            int b = target - nums[i];
            if(map.containsKey(b) && map.get(b) != i){
                return new int[]{map.get(b),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
