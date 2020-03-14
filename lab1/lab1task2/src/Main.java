
public class Main {
    public static void main(String[] args) {
        Cosmetic c = new Cosmetic("lipstick", 100.);

        Manager manager1 = new Manager("Maks", c, 1000);

        manager1.printInfo();
        System.out.println("--------------------------------------------------------------");
        Manager manager2 = new Manager("Mary", c, 300);
        manager2.printInfo();
        System.out.println("--------------------------------------------------------------");
        manager1.add(manager2);

        manager1.sell(c, manager2);
        manager1.sell(c, manager2);
        System.out.println("--------------------------------------------------------------");
        manager1.printInfo();
        manager2.printInfo();
        System.out.println("--------------------------------------------------------------");
        Salesman salesman1 = new Salesman("Ivan", c , 220);

        manager2.add(salesman1);

        manager2.sell(c, salesman1);
        manager2.sell(c, salesman1);
        System.out.println("--------------------------------------------------------------");
        manager2.printInfo();
        salesman1.printInfo();
        System.out.println("--------------------------------------------------------------");
        salesman1.sell(c);

        System.out.println("--------------------------------------------------------------");
        manager1.printInfo();
        manager2.printInfo();
        salesman1.printInfo();

    }
}
