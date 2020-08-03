import java.io.FileNotFoundException;

public class Test {
    public static void main(String args[]) throws FileNotFoundException {
        Sudoku test = new Sudoku();
        System.out.println(test.getNumbers());
        System.out.println(test.getHasAnswer());
        System.out.println(test.printBoard());
    }
}
