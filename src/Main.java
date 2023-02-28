public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName.toUpperCase());
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var fullName = "Иванов Семён Семёнович";
        var replaced = fullName.replace("ё", "е");
        System.out.println(replaced);
    }

}