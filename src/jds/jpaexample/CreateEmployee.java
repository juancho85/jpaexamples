package jds.jpaexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {

    public static void main( String[ ] args ) {
	   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	      employee.setEid( 1 );
	      employee.setEname( "Sánchez" );
	      employee.setSalary( 40000 );
	      employee.setDeg( "Software developer" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   }
}
