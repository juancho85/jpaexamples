package jds.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQueries {

    public static void main( String[ ] args ) {
	   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //This name has to match with the name defined in the NamedQuery annotation in Employee Entity
	      Query query = entitymanager.createNamedQuery("find employee by id");
	      query.setParameter("id", 1204);
	      List<Employee> list = query.getResultList();
	      
	      for( Employee e:list ) {
	         System.out.print("Employee ID :"+e.getEid( ));
	         System.out.println("\t Employee name :"+e.getEname( ));
	      }
	   }
}
