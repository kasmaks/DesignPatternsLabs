public class Main {
    public static void main(String[] args) {
        ShevaStudent st1 = new ShevaStudent("Ivan");
        KPI_Student st2 = new KPI_Student("Maksym");

        System.out.println(st1.doTask(11, 2));
        System.out.println(st2.doTask(12, 5));
    }
}
