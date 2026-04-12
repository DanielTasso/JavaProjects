package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employ;

public class Program {

	public static void main(String[] args) {
	
		
	 Scanner sc = new Scanner(System.in);	
		
	 List<Employ> list = new ArrayList();
		
	 
	 System.out.print("How many employes will be registered? ");
	 int x = sc.nextInt();
	  
	 
	 for(int i=1;i<=x;i++) {
		 
		 System.out.println("Employ #"+i+": ");
	
		 
		 System.out.print("Id: ");
		  Integer id = sc.nextInt();
		  sc.nextLine();
			 System.out.print("Name: ");
			  String name = sc.nextLine();
			  
				 System.out.print("Salary: ");
				  Double salary = sc.nextDouble();		
				  
				  Employ emp = new Employ( id, name,  salary);
				  
				  list.add(emp);
		 
	 }
	 
	 
	  
	 System.out.print("Enter the Id that will have salary increase:");
	  int idSalary = sc.nextInt();
	  
	  Integer pos = position (list,idSalary);
	  
	  if(pos==null) {
		  System.out.println("This Id does not exist!");
		  sc.nextLine();
	  } else {
		  
		  System.out.println("Enter the pecentage: ");
		  double percent=sc.nextDouble();
		  
		  list.get(pos).increaseSalay(percent);
	  }
	  
	  
	 
	 
	 
	 
	 
	    for (Employ emp : list) {
	    	
	    System.out.println(emp.toString());
	    	
	    }
	  
	 
	 
	 
	sc.close();
	}
	
	
	public static Integer position (List<Employ> list, int Id) {
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getId()==Id) {
				
				return i;
			}
			
		}
		
		return null;
	}
	
	

}
