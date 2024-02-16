import java.util.ArrayList;
import java.util.List;

class differenceOfArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        int num1len = nums1.length;
        int num2len = nums2.length;

        for (int i=0; i<num1len; i++) {
            for (int j = 0; j<num2len; j++) {
    
                if(nums1[i] != nums2[j]) {
                    if(j == nums2.length-1) {
                        
                        boolean ans = l1.contains(nums1[i]);
                        if (!ans) {
                            l1.add(nums1[i]);
                        }
                    }
                    continue;
                    
                }
                else {
                    break;
                }
            }
        }

        for (int i=0; i<num2len; i++) {
            for (int j = 0; j<num1len; j++) {
    
                if(nums2[i] != nums1[j]) {
                    if(j == nums1.length-1) {
                        
                        boolean ans = l2.contains(nums2[i]); 
                        if (!ans) {
                            l2.add(nums2[i]);
                        }
                    }
                    continue;
                    
                }
                else {
                    break;
                }
            }    
        }
        
        resultList.add(l1);
        resultList.add(l2);
        return resultList;
    }
}
