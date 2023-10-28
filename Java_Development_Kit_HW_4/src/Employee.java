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
public class Employee {
    private static int nextFreeId = 1;
    private int employeeId;
    private String employeePhone;
    private final String employeeName;
    private int employeeServiceLength;

    {
        this.employeeId = nextFreeId++;
        this.employeePhone = "test+79997772211";
        this.employeeServiceLength = -1;

    }

    public Employee() {
        this.employeeName = "TestJack";
    }

    public Employee(String employeeName, String employeePhone, int employeeServiceLength) {
        this.employeePhone = employeePhone;
        this.employeeName = employeeName;
        this.employeeServiceLength = employeeServiceLength;
    }


    public static int getNextFreeId() {
        return nextFreeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeServiceLength() {
        return employeeServiceLength;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeServiceLength=" + employeeServiceLength +
                '}';
    }
}
