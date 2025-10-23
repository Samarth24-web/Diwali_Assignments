package Service;

import java.util.List;

import Model.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	boolean deleteEmpById(int id);

	List<Employee> getAllEmp();

	java.util.List<Employee> sortEmpById();

	List<Employee> findEmpByName(String name);

	boolean saveAllEmpToFile();

}
