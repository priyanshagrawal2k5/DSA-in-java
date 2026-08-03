class Solution {
    public boolean validMountainArray(int[] arr) { // 0 3 2 1 
        boolean flag = true;
        int maxpoint = arr[0];
        int maxindex=0;
        if(arr.length >= 3){
            for(int i=0; i<arr.length; i++){
                if(arr[i] > maxpoint){
                    maxpoint = arr[i];
                    maxindex = i;
                }
            }

            if((maxindex == arr.length-1) || (maxindex == 0)){
                flag = false;
            }

            // strictly increasing
            for(int i=0; i<maxindex; i++){
                if(arr[i] >= arr[i+1]){
                    flag = false;
                }
            }

            // strictly decreasing 
            for(int i=maxindex; i<arr.length; i++){
                if((i+1) < arr.length){
                    if(arr[i] <= arr[i+1]){
                        flag = false;
                    }
                }
            }
        }else{
            flag = false;
        }

        return flag;
    }
}