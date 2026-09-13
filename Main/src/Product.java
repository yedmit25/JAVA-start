public enum Product {
    WATER(1, "Вода", 50),
    CHOCOLATE(2, "Шоколад", 80),
    CHIPS(3, "Чипсы", 100),
    SODA(4, "Газировка", 120);

    private final int number;
    private final String name;
    private final int price;

    Product(int number, String name, int price){
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public static Product findByNumber(int number){
        for (Product product : values()){
            if (product.getNumber() == number){
                return product;
            }
        }

        return null;
    }
}
