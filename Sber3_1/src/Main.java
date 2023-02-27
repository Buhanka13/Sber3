public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("79514397592", "Samsung", 150.0);
        Phone phone2 = new Phone("89514257645", "iPhone");

        phone1.receiveCall("Александр");
        phone2.receiveCall("Виктория", "555-4895");

        String[] numbers = {"555-1111", "555-2222", "555-3333"};
        phone1.sendMessage(numbers);

        System.out.println(phone1);
        System.out.println(phone2);
    }
}