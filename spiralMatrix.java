//Spiral matrix 
//Given a positive integer n, the task is to generate an n x n matrix filled with integers from 1 to n*n in a spiral order. 
//The spiral order starts from the top-left corner and moves in a clockwise direction, filling in the numbers row by row.

public class spiralMatrix{
    public static void main(String arg[]){
        
       int array[][] = {
       {1,2,3,4},
       {5,6,7,8},
       {9,10,11,12}};

       spiralMatrixDisplay(array);
    }

    public static void spiralMatrixDisplay(int array[][]){
       int sizeR = array.length;
       int sizeC = array[0].length;

       int startRow=0;
       int endRow=sizeR-1;
       int startColumn=0;
       int endColumn=sizeC-1;

     while(startColumn<=endColumn  && startRow<=endRow){
       //TOP
          for(int column=startColumn ; column<endColumn ; column++){
            System.out.print(array[startRow][column]+"\t");  
            }

       //RIGHT
          for(int rows=0 ; rows<endRow ; rows++){
            System.out.print(array[rows][endColumn]+"\t");
          }

       //BOTTOM
          for(int columnz=endColumn; columnz>startColumn ;columnz-- ){
            System.out.print(array[endRow][columnz]+"\t");
          }

       //LEFT
       for(int rowz=endRow ; rowz>startRow ; rowz--){
        System.out.print(array[rowz][startColumn]+"\t");
       }


       startRow++;
       endColumn--;
       startColumn++;
       endRow--;
       }

    }
}
