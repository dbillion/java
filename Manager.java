package dayo;

public class Manager extends Employee {
	
	private double bonusPct;

	public Manager() {
		super();
	}

	public Manager(String name, String jobTitle, double salary ,double bonusPct) {
		super(name, jobTitle, salary);
		this.bonusPct=bonusPct;
	}

	@Override
	public String toString() {
		return "Manager [bonusPct=" + bonusPct +" : " + super.toString()+ "]";
	}

	@Override
	public double calculateBonus(){
		double bonus=bonusPct/100*getSalary();
		return bonus;
	}
	
	public double getBonusPct() {
		return bonusPct;
	}

	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	

}
