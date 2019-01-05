package _88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[nums1.length];
        int i=0,j=0,z=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                result[z] = nums1[i];
                i++;
            }else{
                result[z] = nums2[j];
                j++;
            }
            z++;
        }
        if(i == m){
            while(j<n){
                result[z] = nums2[j];
                j++;
                z++;
            }
        }
        if(j == n){
            while(i<m){
                result[z] = nums1[i];
                i++;
                z++;
            }
        }
        for(i=0;i<result.length;i++){
            nums1[i] = result[i];
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int[] a = {1,2,6,9,0,0,0,0,0,0};
        int[] b = {2,2,4,5,7,8};
        s.merge(a,10,b,6);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
