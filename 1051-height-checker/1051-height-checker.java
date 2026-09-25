class Solution {
 //imprort java.util.*;   
 public int heightChecker(int[] heights) {
        int res1[] = heights.clone();
        int count = 0;
        Arrays.sort(res1);
        for(int j = 0; j<heights.length; j++){
            if(res1[j]!=heights[j]){
                count++;
            }

        }
        return count;
    }
}