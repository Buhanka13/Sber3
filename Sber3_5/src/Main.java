public class Main {
    public static void main(String[] args) {PizzaOrder order1 = new PizzaOrder("Пепперони", Size.BIG, true, "ул. Орлова, д. 6");
        PizzaOrder order2 = new PizzaOrder("С грибами", Size.MEDIUM, false, "ул. Мира, д. 15");

        System.out.println(order1);
        order1.order();
        System.out.println(order1);
        order1.order();
        System.out.println(order1);
        order1.cancel();
        System.out.println(order1);

        System.out.println(order2);
        order2.order();
        System.out.println(order2);
        order2.cancel();
        System.out.println(order2);
    }
}