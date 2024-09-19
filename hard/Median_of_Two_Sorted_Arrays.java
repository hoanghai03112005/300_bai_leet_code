
public class Median_of_Two_Sorted_Arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int[] merger = new int[m+n];
        double median = 0.0;
        int i=0, j=0, k=0;
        while (i< m && j< n) {
            
            if(nums1[i] < nums2[j]) {
                merger[k++] = nums1[i++];
            } else {
                merger[k++] = nums2[j++];
            }

        }

        while (i < m) {
            merger[k++] = nums1[i++];
        }

        
        while (j < n) {
            merger[k++] = nums2[j++];
        }
         
        int totalLength = m + n ;
        for (int h = 0; h < totalLength; h++) {
            int left = 0;
            int right = totalLength - 1;
            if(totalLength % 2 != 0) {
                
                int mid = (left+right) /2;
                 median = merger[mid];
                 break;
            } else {
                double mid = Math.ceil((left+right)/ 2.0);
                int mid1 = (int)mid;
                
                int mid2 = mid1 - 1;
                median = (merger[mid1] + merger[mid2]) / 2.0;
            }
                
            
            
        }
        return median;
    }
    public static void main(String[] args) {
        int[] n1 = {1, 2};
        int[] n2 = {3, 4};
        
        findMedianSortedArrays(n1, n2);
        System.out.println("ok");
    }
}
