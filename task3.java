public class task3 { {}
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            printOddNumbers(arr);
        }
    
        public static void printOddNumbers(int[] arr) {
            boolean flag;
            flag = true;        
            for (int x = 0; x < arr.length; x++) {
                if(arr[x]%2 == 0){
                    if(flag){
                        System.out.print(arr[x]); 
                        flag = false;                   
                    }else{
                        System.out.print(", " + arr[x]);
                    }
                }
            }       
            System.out.println();
        }    
    }