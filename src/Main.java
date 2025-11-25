public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван Иванович", "Рабочий",
                "ivanov@company.com", "+7-911-123-45-67", 75000, 30);
        employees[1] = new Employee("Петров Петр Петрович", "Программист",
                "petrov@company.com", "+7-911-234-56-78", 85000, 25);
        employees[2] = new Employee("Сидоров Иван Иванович", "Охранник",
                "sidorov@company.com", "+7-911-345-67-89", 80000, 30);
        employees[3] = new Employee("Иванова Мария Владимировна", "Директор",
                "ivanova@company.com", "+7-911-456-78-90", 120000, 50);
        employees[4] = new Employee("Сидорова Ольга Владимировна", "Бухгалтер",
                "sidorova@company.com", "+7-911-567-89-01", 65000, 45);

        System.out.println("СОТРУДНИКИ СТАРШЕ 40 ЛЕТ:\n");
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}
