package patikaDev.Java101.BitirmeProjesi;
import java.util.Scanner;

public class SweeperGame {
    Mine mineFieldMatrix;
    Mine screenFieldMatrix;
    int rowNumber;
    int columnNumber;

    Scanner input = new Scanner(System.in);

    SweeperGame(){
        rowNumber = getIntAnswer("Please enter any row number: ");
        columnNumber = getIntAnswer("Please enter any column number: ");

        mineFieldMatrix = new Mine(rowNumber,columnNumber).create();
        screenFieldMatrix = new Mine(rowNumber,columnNumber).createEmptyField();
    }

    public void play(){
        boolean isWin = false;
        boolean isExploded = false;
        int openedFieldNumber = 0;

        while(!isWin && !isExploded){
            screenFieldMatrix.printMatrix();
            int checkRowNumber = getIntAnswer("Please enter row number want to see: ")-1;
            int checkColumnNumber = getIntAnswer("Please enter column number want to see: ")-1;

            if(checkRowNumber >= this.rowNumber || checkRowNumber <0 || checkColumnNumber >= this.columnNumber || checkColumnNumber <0){
                System.out.println("Please enter valid numbers");
                continue;
            }

            String hiddenValue = mineFieldMatrix.getFieldValue(checkRowNumber, checkColumnNumber);

            if(mineFieldMatrix.getFieldValue(checkRowNumber, checkColumnNumber).equals("*")){
                isExploded = true;
                mineFieldMatrix.printMatrix();
            }else{
                screenFieldMatrix.setFieldValue(checkRowNumber,checkColumnNumber, hiddenValue);
                openedFieldNumber++;
            }

            if(openedFieldNumber == mineFieldMatrix.getNumberFieldWithoutMines()) isWin = true;
        }

        if(isWin) System.out.println("YOUWIN!");
        else System.out.println("Try Again!");
    }

    private int getIntAnswer(String question){
        System.out.print(question);
        return input.nextInt();
    }

}
