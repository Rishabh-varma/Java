import java.util.*;

public class javatut13_1 {
    public static void main(String[] args) {
        hollowrec(5, 5);
        hollowtri(5);
        invhalfpyramid(5);
        invhalfpyramidno(5);
        flyodtri(5);
        zero_onetri(5);
        butterflypattern(5);
        solid_rhombus(5);
        hollow_rhombus(5);
        diamond(5);
        numpyramid(5);
        palandromicpattern(5);
    }

    public static void hollowrec(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowtri(int totrows) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == totrows || j == 1 || j == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    public static void invhalfpyramid(int totrows) {
        for (int i = 1; i <= totrows; i++) {
            for (int space = 1; space <= totrows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invhalfpyramidno(int totrows) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totrows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void flyodtri(int totrows) {
        int k = 1;
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void zero_onetri(int totrows) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void butterflypattern(int n) {
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            // star
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void numpyramid(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            System.out.println();
            count = count + 1;
        }
    }

    public static void palandromicpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) { 
                System.out.print(" ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

}