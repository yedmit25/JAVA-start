public class VendingMachine {
    public String buyProduct(int depositedMoney, int productNumber)
    {
        Product product = Product.findByNumber(productNumber);

        if (product == null){
            return "Ошибка: товара с таким номером не существует.";
        }

        if (depositedMoney < 0)
        {
            return "Ошибка: внесённая сумма не может быть отрицательной.";
        }

        int price = product.getPrice();

        if (depositedMoney < price){
            int missingMoney = price - depositedMoney;
            return "Недостаточно денег. Не хватает: " + missingMoney + " руб.";
        }

        int change = depositedMoney - price;

        if (change == 0)
        {
            return "Товар \"" + product.getName() + "\" куплен без сдачи.";
        }

        return "Вы купили: " + product.getName() + ". Сдача: " + change + " руб.";
    }
}
