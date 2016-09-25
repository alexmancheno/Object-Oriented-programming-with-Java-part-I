
public class Printing {

    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
    public static void printSquare(int sideSize) {
        int i = 1;
        while (i <= sideSize) {
            printStars(sideSize);
            System.out.print("");
            i++;
        }
        
    }

    public static void printRectangle(int width, int height) {
        int i = 1;
        int y = 1;
        while (i <= height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        //printStars(5);
        //printStars(3);
        //printStars(9);
        //printSquare(4);
        //printRectangle(5, 6);
        printTriangle(3);
    }

}
