public class Carpim {

    public static void main(String[] args) {


        /**
         * 1	2	3	4	5	6	7	8	9	10
         * 2	4	6	8	10	12	14	16	18	20
         * 3	6	9	12	15	18	21	24	27	30
         * 4	8	12	16	20	24	28	32	36	40
         * 5	10	15	20	25	30	35	40	45	50
         */

/*

        for (int a = 1; a <= 10; a++) {
            System.out.print(a+"\t");
        }
        System.out.println();

        for (int b = 1; b <= 10; b++) {
            System.out.print(b*2+"\t");
        }
        System.out.println();


        for (int c = 1; c <= 10; c++) {
            System.out.print(c*3+"\t");
        }
        System.out.println();
*/


        /**
         * İç içe döngü sub loop
         */

        for (int a = 1; a <= 10; a++) {

            for (int b = 1; b <= 10; b++) {
                System.out.print((b * a) + "\t");
            }
            System.out.println();
        }


    }
}
