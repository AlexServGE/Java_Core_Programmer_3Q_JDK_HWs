/**
 * Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник сотрудников
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory meatAndFishEmps = new EmployeeDirectory();
        Employee testEmp = new Employee();
        Employee Sasha = new Employee("Sasha", "234987923", 1);
        Employee Dasha = new Employee("Dasha", "234987924", 0);
        Employee Kasha = new Employee("Kasha", "idle", 2);
        Employee Basha = new Employee("Basha", "no number", -100);

        meatAndFishEmps.addEmp(testEmp);
        meatAndFishEmps.addEmp(Sasha);
        meatAndFishEmps.addEmp(Dasha);
        meatAndFishEmps.addEmp(Kasha);
        meatAndFishEmps.addEmp(Basha);

        System.out.println(meatAndFishEmps.searchEmpByLengthOfService(2)+"\n");
        System.out.println(meatAndFishEmps.searchEmpPhoneByEmpName("TestJack")+"\n");
        System.out.println(meatAndFishEmps.searchEmpByEmpId(1)+"\n");
        System.out.println(meatAndFishEmps.searchEmpByEmpId(2)+"\n");


    }
}