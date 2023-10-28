import java.util.ArrayList;
import java.util.List;

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
 * <p>
 * private int employeeId;
 * private String employeePhone;
 * private final String employeeName;
 * private int employeeServiceLength;
 */
public class EmployeeDirectory {

    private List<Employee> EmployeeDirectory;

    public EmployeeDirectory() {
        EmployeeDirectory = new ArrayList<>();
    }

    /**
     * Добавить метод добавление нового сотрудника в справочник сотрудников
     *
     * @param someEmployee
     */
    public void addEmp(Employee someEmployee) {
        this.EmployeeDirectory.add(someEmployee);
    }

    /**
     * Добавить метод, который ищет сотрудника по стажу (может быть список)
     *
     * @param employeeServiceLength
     * @return
     */
    public Employee searchEmpByLengthOfService(int employeeServiceLength) {
        for (Employee employee : this.EmployeeDirectory) {
            if (employee.getEmployeeServiceLength() == employeeServiceLength) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
     *
     * @param employeeName
     * @return
     */
    public  String searchEmpPhoneByEmpName(String employeeName) {
        for (Employee employee : this.EmployeeDirectory) {
            if (employee.getEmployeeName().equals(employeeName)) {
                return employee.getEmployeePhone();
            }
        }
        return null;
    }

    /**
     * Добавить метод, который ищет сотрудника по табельному номеру
     *
     * @param employeeId
     * @return
     */
    public  Employee searchEmpByEmpId(int employeeId) {
        for (Employee employee : this.EmployeeDirectory) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
}
