class BinarySearch {
    public int search(int[] nums, int target) {
        int left=0, right = nums.length-1;
        int mid;
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target)                
                return mid;
            if(target < nums[mid]) 
                right = mid-1;
            else 
                left = mid+1;
        } 
        // loop finished, element not found
        return -1;
    }
}
