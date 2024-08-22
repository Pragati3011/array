package arrayproblem;

public class arraymaxmin {

        public static void main(String[]args){
        int[]arr ={3,5,7,9,2,1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                if (arr[i] < min){
                }
            }
            System.out.println(" value of max"+max);
            ++max;
            System.out.println("value of min no"+min);
            ++min;
        }

    }
    }

