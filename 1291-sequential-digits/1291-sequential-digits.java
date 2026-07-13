class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();

        String str = "123456789";
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for (int len = lowLen; len <= highLen; len++) {

            for (int start = 0; start + len <= str.length(); start++) {

                int num = Integer.parseInt(str.substring(start, start + len));

                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }

        return list;
    }
}