package Service;

import java.util.List;
import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao empDao ;
	public EmployeeServiceImpl(){
		empDao = new EmployeeDaoImpl();
	}
	@Override
	public boolean addNewEmployee() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id:");
			int id = sc.nextInt();
			System.out.println("Enter employee name:");
			String name = sc.next();
			System.out.println("Enter employee role");
			String role= sc.next();
			Employee emp = new Employee(id , name , role);
			return empDao.save(emp);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	@Override
	public boolean deleteEmpById(int id) {
		return empDao.deleteById(id);
	}
	@Override
	public List<Employee> getAllEmp() {
		return empDao.findAll();
	}
	@Override
	public List<Employee> sortEmpById() {
		return empDao.sortById();
	}
	@Override
	public List<Employee> findEmpByName(String name) {
		return empDao.findByName(name);
	}
	@Override
	public boolean saveAllEmpToFile() {
		return empDao.saveToFile();
	}

}
