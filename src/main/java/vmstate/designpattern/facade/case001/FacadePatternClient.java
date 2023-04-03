package vmstate.designpattern.facade.case001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int choice;
    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= Computer Shop ============ \n");
            System.out.print("1. Apple.              \n");
            System.out.print("2. Dell.              \n");
            System.out.print("3. Acer.                 \n");
            System.out.print("4. Exit.                   \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1:
                    {
                        shopKeeper.appleSale();
                    }
                    break;
                case 2:
                    {
                        shopKeeper.dellSale();
                    }
                    break;
                case 3:
                    {
                        shopKeeper.acerSale();
                    }
                    break;
                default:
                    {
                        System.out.println("Nothing You purchased");
                    }
                    return;
            }
        } while (choice != 4);
    }
}
