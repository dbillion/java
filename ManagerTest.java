package dayo;

public class ManagerTest {

	public static void main(String[] args) {
Manager mgr1= new Manager("Dura", "Senior Manager", 4000,20);
System.out.println(mgr1);

System.out.println("Bonus for mgr1: " + mgr1.calculateBonus());

//emp1.calculateBonus();

Employee emp1= new Manager("Dare", "Manager", 25000,15);
System.out.println("Bonus for emp1: " + emp1.calculateBonus());

	}
}
