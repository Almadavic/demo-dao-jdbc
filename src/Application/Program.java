package Application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
public static void main(String[] args) {

	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	System.out.println("=== TEST1 : seller findById===");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	System.out.println("\n=== TEST2 : seller findByDepartment===");
	Department department = new Department(2,null);
	List<Seller>list = sellerDao.findByDepartment(department);
	for(Seller obj : list) {
		System.out.println(obj);
	}
	System.out.println("\n=== TEST3 : seller findAll===");
	list = sellerDao.findAll();
	for(Seller obj : list) {
		System.out.println(obj);
	}
	
	System.out.println("\n=== TEST4 : seller Insert===");
	Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0,department);
	sellerDao.insert(newSeller);
	System.out.println("Inserted ! New id = "+newSeller.getId());
	
	System.out.println("\n=== TEST5 : seller Update===");
	seller = sellerDao.findById(2);
	seller.setName("Martha Waine");
	sellerDao.update(seller);
	System.out.println("Update completed");
	
   }
}
