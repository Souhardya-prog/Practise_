package School_CodingCompetition2024.Patterns;

public class Pat1 {
    public static void main(String args []){
        int n = 5;
        for(int i = 1; i<=n ; i++){
            for (int j = i; j<n; j++){
                System.out.print("  ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            for (int j = 1; j <i ; j++) {
                System.out.print("* ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <n ; j++) {
                System.out.print("* ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            for(int j = i; j<n-1; j++){
                System.out.print("* ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }


    }

}
