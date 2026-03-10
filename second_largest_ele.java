class Solution {
    int getSecondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }
}