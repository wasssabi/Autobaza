package data.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import data.base.entity.CarSeller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
         EntityManager em = factory.createEntityManager();
         
         em.getTransaction().begin();
     
        
//      for(int i=1; i<=100; i++) {
//     	CarSeller seller = new CarSeller(i,"First_name#"+1,i,"Second_name #"+1);	
//    em.persist(seller);	
//     }	
         

         
//         CarSeller seller = em.createQuery("SELECT * FROM car_seller where car_seller.id = :id ",CarSeller.class)
//        		 .setParameter("id", new Long(30)).getSingleResult();
//         System.out.println(seller);
         
List<CarSeller>  tech = em.createQuery("SELECT c_s FROM car_seller c_s", CarSeller.class).getResultList();
em.persist(tech);
tech.forEach(t -> System.out.println(t));

         
         em.getTransaction().commit();
         em.close();
         factory.close();
    }
}
