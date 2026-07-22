class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 1 && digits[0] == 9) {
            return new int[] { 1, 0 };
        }
        int[] newArr = new int[n + 1];

        int d = digits[n - 1];
        int newD = d + 1;
        if (newD < 9) {
            digits[n - 1] = newD;
            return digits;
        } else {
            newArr[n] = newD % 10;
            int carry = newD / 10;
            for (int i = n - 1; i > 0; i--) {
                int newDigit = digits[i - 1] + carry;
                newArr[i] = newDigit % 10;
                carry = newDigit / 10;
            }
            newArr[0] = carry;
            if (newArr[0] == 0) {
                int[] result = new int[n];
                for (int i = 0; i < n; i++) {
                    result[i] = newArr[i + 1];
                }
                return result;
            }
        }
        return newArr;
    }
}