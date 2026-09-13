import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        // автомат по продаже проудктов
        System.out.println("Продуктовый автомат");
        System.out.println("----------------------");

        for (Product product : Product.values()){
            System.out.println(
                    product.getNumber() + ". "
                    + product.getName() + "-"
                    + product.getPrice() + " руб."
            );
        }

        System.out.println("Введите внесённую сумму");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: необходимо ввести целое число.");
            scanner.close();
            return;
        }

        int depositedMoney = scanner.nextInt();

        System.out.println("Выберете номер товара");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: необходимо ввести целое число.");
            scanner.close();
            return;
        }

        int productNumber = scanner.nextInt();
        String result = vendingMachine.buyProduct(
                depositedMoney,
                productNumber
        );
        System.out.println(result);

        scanner.close();
    }
}