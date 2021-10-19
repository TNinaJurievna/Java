package lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrovich Petr", "Engineer", "petrovich@mailbox.com", "892312366", 60000, 28);
        persArray[2] = new Employee("Sidorova Irina", "Engineer", "sidorova@mailbox.com", "892376366", 70000, 40);
        persArray[3] = new Employee("Petrova Zinaida", "Engineer", "petrovaz@mailbox.com", "892312366", 66000, 45);
        persArray[4] = new Employee("Fedorov Fedor", "Engineer", "fedorov@mailbox.com", "892312366", 20000, 23);

        for (Employee employee: persArray) {
            employee.showInfoForOld();
        }
    }

}
