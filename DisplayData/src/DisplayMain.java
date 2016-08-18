
public class DisplayMain {
	
	public static void main(String args []){
		OrderList ol = new OrderList();
		
		display();
		ol.displayOrder();
	}
	
	static void display(){
		System.out.println("Inside main display");
		System.out.println("First Change");
	}

}
