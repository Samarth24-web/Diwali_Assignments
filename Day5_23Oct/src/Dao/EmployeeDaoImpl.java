package Dao;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import Model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> empList ;
	
	static {
		empList = new ArrayList<>();
		empList.add(new Employee(101 , "samarth" , "SWE"));
		empList.add(new Employee(102 , "sathak" , "GET"));
		empList.add(new Employee(103 , "Ram" , "Assistant"));
	}
	
	@Override
	public boolean save(Employee emp) {
		return empList.add(emp);
	}

	@Override
	public boolean deleteById(int id) {
		return empList.remove(new Employee(id));
	}

	@Override
	public List<Employee> findAll() {
		return empList;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> sortedList = new ArrayList<>(empList);
		sortedList.sort(null);
		return sortedList;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		for(Employee e : empList) {
			if(e.getEmpName().equals(name)) {
				 list.add(e);
			}
		}
		if(list.size()==0)
		return null;
		return list;
	}

	@Override
	public boolean saveToFile() {
		try (
				FileOutputStream fos = new FileOutputStream("Employees.txt");
				)
		{
			for(Employee e : empList) {
				String id = "Employee Id :"+e.getEmpId()+"\n";
				String name = "Employee name:"+e.getEmpName()+"\n";
				String role = "Employee role :"+e.getEmpRole()+"\n";
				fos.write(id.getBytes());
				fos.write(name.getBytes());
				fos.write(role.getBytes());
				fos.write("\n".getBytes());
			}
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
}
