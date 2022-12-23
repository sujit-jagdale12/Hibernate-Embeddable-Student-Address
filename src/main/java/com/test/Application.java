package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Application {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

// Saving data
		/*
		 * Address address=new Address("gdwfsasd", "fsdf", 412207, "fsfds"); Student
		 * student=new Student("Sujit Jagdale", "sujit123@gmail.com", address);
		 * 
		 * session.save(student);
		 */
		
// Reading of data
		/*
		      System.out.println("ID: "+student.getId()); 
			  System.out.println("Name: "+student.getName());
			  System.out.println("Email: "+student.getEmail());
			  System.out.println("Street: "+student.getAddress().getStreet());
			  System.out.println("City: "+student.getAddress().getCity());
			  System.out.println("Pincode: "+student.getAddress().getPincode());
			  System.out.println("State: "+student.getAddress().getState());		  
		 */

// Updateing data
		/*
		 * Student student=session.get(Student.class, 1);
		 * 
		 * student.getAddress().setStreet("Karve");
		 * student.getAddress().setPincode(412207);
		 * student.getAddress().setCity("Pune"); student.getAddress().setState("MH");
		 * session.update(student);
		 */
		
//Deleting data
		/*
		Student student=session.get(Student.class, 3);
		session.delete(student);
		*/

//Retrieving of all data
		List<Student> list=session.createQuery("from Student").list();
		
		for (Student student : list) {
			  System.out.println("ID: "+student.getId()); 
			  System.out.println("Name: "+student.getName());
			  System.out.println("Email: "+student.getEmail());
			  System.out.println("Street: "+student.getAddress().getStreet());
			  System.out.println("City: "+student.getAddress().getCity());
			  System.out.println("Pincode: "+student.getAddress().getPincode());
			  System.out.println("State: "+student.getAddress().getState());		  
			  System.out.println("=========================");
		}
		
		tx.commit();
		session.close();
		factory.close();
	}

}
