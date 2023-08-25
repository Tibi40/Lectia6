public class For {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
                    //   0  1  2  3  4

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray.length);

            System.out.println("Print int from index 1: " + myArray[1]);
            //System.out.println("Print int from index 1: " + stringArray[1]);


        for (int index = 0; index < myArray.length; index++) {
            System.out.println(myArray[index]);
        }
        }

        for(int value : myArray) {
            System.out.println(value);
        }

        int[] testArray = {1, 2, 8, 3, 7, 6};
        for(int i = 0; i <= testArray.length; i++) {
            for(int j = 0; i <= testArray.length; j++) { //al doilea for,actioneaza tot asupra aceluias sir, nu asupra i-ului
                System.out.println(testArray[i] + " " + testArray[j]);

            }
        }
    }
}



