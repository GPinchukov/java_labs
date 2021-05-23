import by.gsu.pms.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Com com = new Com("Milk",new Byn(200));

        AbP[] purchases = {
                new PercentDiscountPurchase(com, 1, 10),
                new PercentDiscountPurchase(com, 5, 20),
                new PriceDiscountPurchase(com, 3, new Byn(20)),
                new PriceDiscountPurchase(com, 8, new Byn(50)),
                new TransportExpensesPurchase(com, 12, new Byn(30)),
                new TransportExpensesPurchase(com, 2, new Byn(15)),
        };

        printPurchases(purchases);

        Arrays.sort(purchases);

        printPurchases(purchases);

        AbP minCostPurchase = null;

        for (AbP purchase: purchases) {
            if(minCostPurchase == null || minCostPurchase.getCost().compareTo(purchase.getCost()) > 0){
                minCostPurchase = purchase;
            }
        }

        System.out.println(minCostPurchase);
    }

    private static void printPurchases(AbP[] purchases){
        for (AbP purchase: purchases) {
            System.out.println(purchase);
        }
    }
}
