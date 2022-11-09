public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 14_699;
        int miles = service.calculate(price);
        System.out.println("Количество бонусных миль: " + miles + " ,при цене билета: " + price);
    }
}
