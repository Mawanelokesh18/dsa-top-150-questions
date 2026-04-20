class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        1-> Brute Force
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[] {i,j};
            }
        }
        return new int[]{0, 0};*/

        // 2-> Optimize Approach

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        } 

        for(int i=0;i<nums.length;i++){
            int val = target - nums[i];
            if(map.containsKey(val) && map.get(val) != i) return new int[] {i, map.get(val)};
        }
        return new int[] {0,0};
    }
}
