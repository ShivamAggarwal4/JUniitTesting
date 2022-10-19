public class FindMaximumNumber {
    public static int findMax(int inputNumbers[]){
        int max= inputNumbers[0];
        for(int i = 1; i< inputNumbers.length; i++){
            if(max< inputNumbers[i])
                max= inputNumbers[i];
        }
        return max;
    }
}

