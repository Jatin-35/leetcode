class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int pivot = -1;

        for(int i = n -1 ; i > 0 ; i--){
            if(nums[i - 1] < nums[i]){
                pivot = i-1;
                break;
            }
        }

        if(pivot == -1){
            reverse(nums , pivot + 1 , n - 1);
            return;
        }

        for(int i = n - 1 ; i > pivot ; i--){
            if(nums[pivot] < nums[i]){
                swap(nums , pivot , i);
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
        
    }

    public void reverse(int []arr , int start , int end){
        while(start <= end){
            swap(arr, start , end);
            start++;
            end--;
        }
    }
    
    public void swap(int [] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 
}