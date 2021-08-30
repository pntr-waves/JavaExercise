package exercise1015;

public class App {
	
//	In this exercise, we modify the accounts payable
//	application of Figs. 10.11�10.15 to include the complete functionality of the payroll application of
//	Figs. 10.4�10.9. The application should still process two Invoice objects, but now should process
//	one object of each of the four Employee subclasses. If the object currently being processed is a Base-
//	PlusCommissionEmployee, the application should increase the BasePlusCommissionEmployee�s base
//	salary by 10%. Finally, the application should output the payment amount for each object. Com-
//	plete the following steps to create the new application:
//	a) Modify classes HourlyEmployee (Fig. 10.6) and CommissionEmployee (Fig. 10.7) to place
//	them in the Payable hierarchy as subclasses of the version of Employee (Fig. 10.13) that
//	implements Payable. [Hint: Change the name of method earnings to getPaymentAmount
//	in each subclass so that the class satisfies its inherited contract with interface Payable.]
//	b) Modify class BasePlusCommissionEmployee (Fig. 10.8) such that it extends the version
//	of class CommissionEmployee created in part (a).
//	c) Modify PayableInterfaceTest (Fig. 10.15) to polymorphically process two Invoices,
//	one SalariedEmployee, one HourlyEmployee, one CommissionEmployee and one Base-
//	PlusCommissionEmployee. First output a String representation of each Payable object.
//	Next, if an object is a BasePlusCommissionEmployee, increase its base salary by 10%. Fi-
//	nally, output the payment amount for each Payable object.
	
	public static void main(String[] args) {
		Payable[] listOfPayable = new Payable[6];
		listOfPayable[0] = new Invoice("01234", "seat", 2, 375.00);
		listOfPayable[1] = new Invoice("56789", "tire", 4, 79.95);
		listOfPayable[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		listOfPayable[3] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		listOfPayable[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		listOfPayable[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

		for (Payable currentPayable : listOfPayable) {
			System.out.println(currentPayable.toString());
			if (currentPayable instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
				employee.setSalaries(employee.getSalaries() * 1.1);
			}
			System.out.println(currentPayable.getPaymentAmount() + "\n");
		}
	}
}
