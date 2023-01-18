public class Point16_TableauA2Dimensions {
    public static void main(String[] args) {

        var tableau2D=new int[][]{
                {1,3,5},//0
                {2,4,6},// 1
                {8,10,12}// 2
        };


        // Première ligne
        System.out.printf("Tableau[0][0] : %d\n",tableau2D[0][0]);
        System.out.printf("Tableau[0][1] : %d\n",tableau2D[0][1]);
        System.out.printf("Tableau[0][2] : %d\n\n",tableau2D[0][2]);

        // Deuxième ligne
        System.out.printf("Tableau[1][0] : %d\n",tableau2D[1][0]);
        System.out.printf("Tableau[1][1] : %d\n",tableau2D[1][1]);
        System.out.printf("Tableau[1][2] : %d\n\n",tableau2D[1][2]);

        // Troisième ligne
        System.out.printf("Tableau[2][0] : %d\n",tableau2D[2][0]);
        System.out.printf("Tableau[2][1] : %d\n",tableau2D[2][1]);
        System.out.printf("Tableau[2][2] : %d",tableau2D[2][2]);

    }
}
/**
 *   1 3 5  // 0
 *   2 4 6  // 1
 *   8 10 12 // 2
 *
 *  3 : (0,1)
 *  12 : (2,2)
 */

