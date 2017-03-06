package problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] cus = new Customer[3];//{);
		Customer c1 = new Customer("Hong", "Ha", "111222333");			
		Customer c2 = new Customer("Hong2", "Ha", "111222334");	
		Customer c3 = new Customer("Hong3", "Ha", "111222335");
		Address add1= new Address("abc","Chicago","sdfd","sdf");
		Address add2= new Address("xyz","Chicago","sdfd","sdf");
		Address add3= new Address("efg","Iowa","sdfd","sdf");
		c1.setBillingAddress(add1);
		c2.setBillingAddress(add2);
		c3.setBillingAddress(add3);	
		cus[0]=c1;
		cus[1]=c2;
		cus[2]=c3;
		for(int i=0; i<cus.length; i++){			
			if(cus[i].getBillingAddress().getCity()=="Chicago"){
				System.out.println(cus[i].toString());
			}
		}
		
	}

}
