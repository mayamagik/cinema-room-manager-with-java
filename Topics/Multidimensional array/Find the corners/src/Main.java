
class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {

        int lastRow = twoDimArray.length - 1;
        int lastCol = twoDimArray[0].length - 1;

        System.out.println(twoDimArray[0][0] + " " +  twoDimArray[0][lastCol]);
        System.out.println(twoDimArray[lastRow][0] + " " +  twoDimArray[lastRow][lastCol]);

    }

 /*  public static void main(String[] args) {

        int [][] twoDimArray = {
                {1},
                {2},
                {4}
        };

        printCorners(twoDimArray);
    }*/

}