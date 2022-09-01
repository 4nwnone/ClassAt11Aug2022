package oop;

public class employee extends inheritanceperson {
	int empId;
	String position;
	float salary;
	
	public employee(int nid, String n, String ad, int eid, String pos, float sal)
	{
		super.nationalId = nid;
		super.name = n;
		super.address = ad;
		this.empId = eid;
		this.position = pos;
		this.salary = sal; 
	}
	public employee()
	{
		super();
	}
	public void display() {
		System.out.println("Employee id: "+empId+"\tPosition: "+position+"\tSalary: "+salary);
	}
	public void parentDisplay()
	{
		super.display();
	}
}
