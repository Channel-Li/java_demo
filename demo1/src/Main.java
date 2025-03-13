// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        int tmp1 = 1;
        int tmp2 = 2;
        int tmp3 = Math.max(tmp1,tmp2);
        System.out.println(tmp3);
        int tmp4 = add_5(1,2,3,4,5);
        System.out.println(tmp4);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @return
     */
    public static int add_5(int a, int b,int c,int d,int e){
        return a+b+c+d+e;
    }

}