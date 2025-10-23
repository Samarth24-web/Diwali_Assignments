package Dao;

import java.util.List;

import Model.Employee;

public interface EmployeeDao {

	boolean save(Employee emp);

	boolean deleteById(int id);

	List<Employee> findAll();

	List<Employee> sortById();

	List<Employee> findByName(String name);

	boolean saveToFile();

}
