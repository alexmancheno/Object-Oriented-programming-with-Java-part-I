
public class PrintingLikeBoss {

    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;

        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int y = 1;
        while (i <= height) {
            printWhitespaces(height - i);
            printStars(y);
            i++;
            y += 2;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        //  printTriangle(5);
        //  System.out.println("---");
        xmasTree(10);
        //System.out.println("---");
        //xmasTree(10);
    }
}
