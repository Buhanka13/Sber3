public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(2, 2);
        a.setValue(0, 0, 1);
        a.setValue(1, 1, 2);
        a.setValue(1, 0, 4);
        a.setValue(0, 1, 6);
        a.print();

        Matrix b = new Matrix(2, 2);
        b.setValue(1, 0, 5);
        b.setValue(0, 1, 5);
        b.setValue(1, 0, 7);
        b.setValue(0, 1, 9);
        b.print();

        a.add(b);
        a.print();

        a.multiply(2);
        a.print();

        Matrix c = a.multiply(b);
        c.print();
    }
}