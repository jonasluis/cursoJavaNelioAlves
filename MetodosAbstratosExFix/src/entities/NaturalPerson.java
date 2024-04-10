package entities;

public class NaturalPerson extends Taxpayer{

	private Double healthExpenditures;
	public NaturalPerson() {
	}
	
	public NaturalPerson(String name, double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthCareSystem() {
		return healthExpenditures;
	}

	public void setHealthCareSystem(Double healthCareSystem) {
		this.healthExpenditures = healthCareSystem;
	}

	@Override
	public double tax() {
		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
		
	}

}
