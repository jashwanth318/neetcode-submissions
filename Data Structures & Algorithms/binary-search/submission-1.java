class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int x=Arrays.binarySearch(nums,target);
        if(x>0)
        {
            return x;
        }
        else if(x==0)
        {
            return x;
        }
        return -1;
    }
}
