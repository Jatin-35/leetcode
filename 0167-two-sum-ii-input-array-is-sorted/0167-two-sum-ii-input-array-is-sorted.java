class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;

        int left = 0;
        int right = n - 1;

        while(left < right){

            int mid = left + (right - left)/2;

            if(numbers[left] + numbers[right] > target){
                right--;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                return new int[] {left+1 , right+1};
            }
        }

        return new int []{};
    }
}