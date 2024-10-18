public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PizzaHut. We Are Open!");
        BasePizza pizza = new ExtraVeggies(new ExtraCheese(new Farmhouse()));
        int billAmount = pizza.cost();
        System.out.println(billAmount);
    }
}