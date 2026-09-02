class Solution {
    public boolean hasDuplicate(int[] nums) {
        int x=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                x++;
            }
        }
        return x>0;
    }
}