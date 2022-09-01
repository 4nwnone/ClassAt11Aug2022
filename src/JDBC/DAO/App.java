package JDBC.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		ProductDao pdao = new ProductDao();
		char ch;
		do 
		{
			System.out.println("Main menu");
			System.out.println("1. Add product");
			System.out.println("2. View product");
			System.out.println("3. View all product");
			System.out.println("4. Update a product");
			System.out.println("5. Delete a product");
			
			do
			{
				System.out.println("Choice");
				ch = sc.next().charAt(0);
				
			}while(!(Integer.parseInt(ch+"")<6 && Integer.parseInt(ch+"")>0));

			if(ch=='1')
			{
				Product p = new Product();
				System.out.println("Enter the product details: ");
				p = getProductDetails();
				int result = pdao.save(p);
				if(result == 1)
					System.out.println("Inserted");
				else
					System.out.println("Not inserted");
			}
			else if (ch=='2')
			{
				System.out.println("Enter the id of the product: ");
				long id = sc.nextLong();
				Product p = pdao.getOne(id);
				System.out.println(p);
			}
			
			else if(ch == '3')
			{
				ArrayList<Product> products = pdao.getAll();
				for(Product stp : products)
				{
					System.out.println(stp);
				}
				System.out.println("----- End of List -----");
				
 			}
			
			else if(ch== '4') {
				System.out.println("Enter the id of the product: ");
				long id = sc.nextLong();
				System.out.println("Enter the updated details: ");
				Product p = new Product();
				p = getProductDetails();
				p.setId(id);
				int i = pdao.update(p);
				if(i==1) {
					System.out.println("Products details updated");
				}
				else {
					System.out.println("Task Fail");
				}
				
			}
			else if(ch == '5')
			{
				System.out.println("Enter the id of the product: ");
				long id = sc.nextLong();
				Product p = pdao.getOne(id);
				System.out.println(p);
				do
				{
					System.out.println("Do you want to delete?(y/n)? ");
					ch = sc.next().charAt(0);
				}while(!(ch=='y'||ch=='n'));
				if(ch == 'y')
				{
					int i = pdao.delete(id);
					if(i == 1)
						System.out.println("Deleted");
					else
						System.out.println("Task failed");
				}
			}
			
			do
			{
				System.out.println("Do you want to continue(y/n)? ");
				ch = sc.next().charAt(0);
			}while(!(ch=='y'||ch=='n'));
			
		}while(ch=='y');
		
	}
	private static Product getProductDetails()
	{
		Product p = new Product();
		System.out.println("Name: ");
		p.setName(sc.next());
		System.out.println("Manufacturer");
		p.setManufacturer(sc.next());
		System.out.println("Description");
		p.setDescription(sc.next());
		System.out.println("Price");
		p.setPrice(sc.nextFloat());
		System.out.println("Is available (y/n)?");
		p.setInStock(sc.next().equalsIgnoreCase("y")?true:false);
		
		return p;
	}
}

