package data.base;

import java.util.List;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.tool.schema.extract.internal.ExtractionContextImpl;

import data.base.entity.Car;
import data.base.entity.CarColor;
import data.base.entity.CarEngineCapacity;
import data.base.entity.CarFuelType;
import data.base.entity.CarModel;
import data.base.entity.CarSeller;
import data.base.entity.Carmake;

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
     
        
      
//
//      for(int i=1; i<=100; i++) {
//       	CarModel model = new CarModel(i);
//       	model.setCarColor(new CarColor("Color #"+1));
//       	model.setCarEngineCapacity(new CarEngineCapacity("2."+i));
//       	model.setCarFuelType(new CarFuelType("FuelType"+i));
//      em.persist(model);	
//      
//      
//       }	
//      
//      for(int i=1; i<=100; i++) {
//    	  Carmake maker = new Carmake(i, 1900+i);
//    	   maker.setCarModel(new CarModel(i));
//    	   em.persist(maker);
//      }
//      
//      for(int i=1; i<=100; i++) {
//    	  Car car = new Car(new BigDecimal(i));
//    	  car.setCarSeller(new CarSeller(i,"First_name#"+1,i,"Second_name #"+1));
//    	  car.setCarMakeq(new Carmake(i, 1900+i));
//    	  em.persist(car);
//    	  
//      }
//      
         

      


      
//------------------------------JPQL-------------------         

//  
//         CarSeller seller = em.createQuery("SELECT c FROM CarSeller c where c.id = :id ",CarSeller.class)
//        		 .setParameter("id", new Long(30)).getSingleResult();
//         System.out.println(seller);
//         
         
//       List<Car> cari = em.createQuery("SELECT c FROM Car c WHERE c.id LIKE '%4'",Car.class).getResultList();
//       cari.forEach(c -> System.out.println(c));
         
//    List<Car> cari = em.createQuery("SELECT c FROM Car c WHERE c.id BETWEEN :start AND :finish",Car.class)
//    		.setParameter("start", new Long(1))
//    		.setParameter("finish",new Long(5))
//    		.getResultList();
//    cari.forEach(c -> System.out.println(c));
         
         
         
//         BigDecimal min = em.createQuery("SELECT min(c.sell_price) FROM Car c",BigDecimal.class).getSingleResult();
//         System.out.println(min);
         
//         Long count = em.createQuery("SELECT count(cs) FROM CarSeller cs",Long.class).getSingleResult();
//         System.out.println(count);
         
         
         //---------------------------Criteria------------
         CriteriaBuilder cb = em.getCriteriaBuilder();
       CriteriaQuery<Car> query = cb.createQuery(Car.class);       
       Root<Car> root = query.from(Car.class);
       query.select(root);
       
       
       
//       Expression<Long> betweenId = root.get("id");
//       Predicate predicateId = cb.between(betweenId, new Long(5), new Long(15));

//       query.where(predicateId);
       
       
//       
//       Expression<Long> likeID = root.get("id");
//       Predicate preId = cb.greaterThan(likeID, new Long(50));
//       query.where(preId);
       
       
       
//       Expression<BigDecimal> priceE = root.get("sell_price");
//       Predicate prePo = cb.ge(priceE, new BigDecimal("50"));
//       Predicate prePs = cb.le(priceE, new BigDecimal("60"));
//       Predicate allP = cb.and(prePo,prePs);
//       query.where(allP);
//       
       
       
     List<Car> courses = em.createQuery(query).getResultList();
     courses.forEach(c -> System.out.println(c));
     
 
//         

         
         em.getTransaction().commit();
         em.close();
         factory.close();
    }
}
