public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1){
            return 1;
        }
        if(arr.length == 2){
            if(arr[0] == arr[1]){
                return 1;
            }
            return 2;
        }
        int max = 1;
        int cur = 2;

        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == arr[i - 1]){
                if(arr[i + 1] == arr[i]){
                    cur = 1;
                } else cur = 2;
                max = Math.max(cur, max);

                continue;
            }

            if(arr[i] > arr[i - 1]){

                if(arr[i] > arr[i + 1]){
                    cur++;
                    max = Math.max(cur, max);
                }else {
                    if(arr[i] == arr[i + 1]){
                        cur = 1;
                    }else cur = 2;
                    max = Math.max(cur, max);
                }
            }else {

                if(arr[i] < arr[i + 1]){
                    cur++;
                    max = Math.max(cur, max);
                }else {
                    if(arr[i] == arr[i + 1]){
                        cur = 1;
                    }else cur = 2;
                    max = Math.max(cur, max);
                }
            }
        }
        return max;
    }
}