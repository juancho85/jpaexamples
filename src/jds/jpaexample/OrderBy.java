package jds.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OrderBy {

    public static void main( String[ ] args ) {
	   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select e from Employee e order by e.ename desc" );
	      List<Employee> list=(List<Employee>)query.getResultList( );

	      for( Employee e:list ){
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee salary :" + e.getEname());
	      }

	   }
}
