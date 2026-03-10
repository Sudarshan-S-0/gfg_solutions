class Solution {
    int missingNum(int arr[]) {

        long n = arr.length + 1;

        long totalSum = n * (n + 1) / 2;

        long arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return (int)(totalSum - arrSum);
    }
}
