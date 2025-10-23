package Test;
import java.util.*;

import Service.*;
import Model.*;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeService empService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("1)Add new employee.");
			System.out.println("2)Delete an employee.");
			System.out.println("3)get all employees.");
			System.out.println("4)Sort all employees by id. ");
			System.out.println("5)Find Employee By name.");
			System.out.println("6) save to file.");
			System.out.println("7)Exit.");
			System.out.println("Enter Choice :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 ->{
				boolean status = empService.addNewEmployee();
				if(status) {
					System.out.println("Employee added sucessfully.");
				}else {
					System.out.println("Error....! Not added");
				}
			}
			case 2->{
				System.out.println("Enter Employee id to delete an Employee.");
				int id=sc.nextInt();
				boolean status = empService.deleteEmpById(id);
				if(status) {
					System.out.println("Employee deleted sucessfully.");
				}else {
					System.out.println("Error....! Not found");
				}
			}
			case 3->{
				List<Employee> empList=empService.getAllEmp();
				if(empList!=null && empList.size()!=0) {
					empList.forEach(System.out::println);
				}else {
					System.out.println("Empty Empoyee list.");
				}
			}
			case 4->{
				List<Employee> sortedEmpList = empService.sortEmpById();
				if(sortedEmpList!=null && sortedEmpList.size()!=0) {
					sortedEmpList.forEach(System.out::println);
				}else {
					System.out.println("Empty Empoyee list.");
				}
			}
			case 5->{
				System.out.println("Enter name.");
				String name = sc.next();
				List<Employee> emp = empService.findEmpByName(name);
				if(emp!=null) {
					emp.forEach(System.out::println);
				}else {
					System.out.println("Error! Not found.");
				}
			}
			case 6->{
				boolean status=empService.saveAllEmpToFile();
				if(status) {
					System.out.println("saved sucessfully.");
				}else {
					System.out.println("Error");
				}
			}
			case 7->{
				System.out.println("Thank you!");
			}
			default->{
				System.out.println("Wrong choice! Please enter choice again.");
			}
			}
			
		}while(true);
		
	}
}
