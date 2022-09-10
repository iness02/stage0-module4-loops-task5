package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height % 2 != 0||height==0) {
            int subtract = height / 2;

            for (int i = height - subtract; i >= 1; i--) {

                for (int j = i; j < height - subtract; j++) {
                    System.out.print(" ");
                }


                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print(8);
                }

                for (int j = i; j < height - subtract; j++) {
                    System.out.print(" ");
                }

                System.out.println();
            }

            for (int i = 2; i <= height - subtract; i++) {

                for (int j = i; j < height - subtract; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print(8);
                }

                for (int j = i; j < height - subtract; j++) {
                    System.out.print(" ");
                }

                System.out.println();
            }


        }else{
            System.out.println("888888\n" +
                    " 8888 \n" +
                    "  88  \n" +
                    "  88  \n" +
                    " 8888 \n" +
                    "888888");
        }
    }


}

