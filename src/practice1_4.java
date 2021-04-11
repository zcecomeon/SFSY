import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Vector;

public class practice1_4 {
    public practice1_4(){
    }
    public static ArrayList<Integer> mergeArrays(int[] arrayOne, int[] arrayTwo){
        int arrayOneLen = arrayOne.length;
        int arrayTwoLen = arrayTwo.length;
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        int i= 0, j=0;

        while(i<arrayOneLen || j<arrayTwoLen){
            if(i==arrayOneLen && j<arrayTwoLen){
                resultArray.add(arrayTwo[j]);
                j++;
            }else if(i<arrayOneLen && j==arrayTwoLen){
                resultArray.add(arrayOne[i]);
                i++;
            }else{
                if(arrayOne[i]<=arrayTwo[j]){
                    resultArray.add(arrayOne[i]);
                    i++;
                }else if(arrayOne[i]>arrayTwo[j]){
                    resultArray.add(arrayTwo[j]);
                    j++;
                }
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arrA = {1,3,5,7,8,9,11,12};
        int[] arrB = {2,4,6,8,10,12,13};
        ArrayList<Integer> arrList = mergeArrays(arrA,arrB);
        System.out.println(arrList.get(6));
    }
}





//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if (nums1.length > nums2.length) {
//            return findMedianSortedArrays(nums2, nums1);//保证参数中的数组第一个长度小于第二个
//        }
//
//        int m = nums1.length;
//        int n = nums2.length;
//        int left = 0, right = m;
//        // median1：前一部分的最大值
//        // median2：后一部分的最小值
//        int median1 = 0, median2 = 0;
//
//        while (left <= right) {
//            // 前一部分包含 nums1[0 .. i-1] 和 nums2[0 .. j-1]
//            // 后一部分包含 nums1[i .. m-1] 和 nums2[j .. n-1]
//            int i = (left + right) / 2;
//            int j = (m + n + 1) / 2 - i;
//
//            // nums_im1, nums_i, nums_jm1, nums_j 分别表示 nums1[i-1], nums1[i], nums2[j-1], nums2[j]
//            int nums_im1 = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
//            int nums_i = (i == m ? Integer.MAX_VALUE : nums1[i]);
//            int nums_jm1 = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
//            int nums_j = (j == n ? Integer.MAX_VALUE : nums2[j]);
//
//            if (nums_im1 <= nums_j) {
//                median1 = Math.max(nums_im1, nums_jm1);
//                median2 = Math.min(nums_i, nums_j);
//                left = i + 1;
//            } else {
//                right = i - 1;
//            }
//        }
//
//        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
//    }
//}
//
//
//
