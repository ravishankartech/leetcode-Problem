class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (!Character.isLetter(arr[start])) {
                start++;
            }

            else if (!Character.isLetter(arr[end])) {
                end--;
            }

            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }
}