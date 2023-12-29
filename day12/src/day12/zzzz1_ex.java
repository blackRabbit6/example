package day12;

import java.util.Scanner;

public class zzzz1_ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iProperStock1 = 10;
        int iProperStock2 = 10;

        int iCurrentStock1 = 0;
        int iCurrentStock2 = 0;

        for (int i = 0; i < 10; ++i) {
            iCurrentStock1 = processStock(iCurrentStock1, iProperStock1, sc);
            iCurrentStock2 = processStock(iCurrentStock2, iProperStock2, sc);

            System.out.println("\n계속하려면 아무 키나 누르세요...\n");
            sc.nextLine();
        }

        printStockStatus("적정재고", iProperStock1, "현재재고", iCurrentStock1);
        printStockStatus("적정재고", iProperStock2, "현재재고", iCurrentStock2);

        sc.close();
    }

    public static int processStock(int currentStock, int properStock, Scanner sc) {
        System.out.println("보충 전 현재재고: " + currentStock);

        if (currentStock < properStock) {
            currentStock += (properStock - currentStock);
        }

        System.out.print("주문하시겠습니까? (y/n) ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("y")) {
            currentStock = processOrder(currentStock, sc);
            System.out.println("고객 주문 후 현재 재고: " + currentStock);
        }

        printStockStatus("적정재고", properStock, "현재재고", currentStock);

        return currentStock;
    }

    public static int processOrder(int currentStock, Scanner sc) {
        System.out.print("주문량을 입력하세요: ");
        int orderQty = Integer.parseInt(sc.nextLine());
        currentStock -= orderQty;

        return currentStock;
    }

    public static void printStockStatus(String label1, int value1, String label2, int value2) {
        System.out.println(label1 + ": " + value1 + "  " + label2 + ": " + value2);
    }
}
