class moveZero {
    public static void moveZeroes(int[] nums) {
        
        for (int i=0; i<nums.length; i++) {
            if (i!=0) {
                if(nums[i]!=0) {
                    for (int j=i; j>0; j--) {
                        if (nums[j-1] == 0){
                        int a = nums[j-1];
                        nums[j-1] = nums[j];
                        nums[j] = a;
                    }
                    }
                }
            }
        }
    }
}