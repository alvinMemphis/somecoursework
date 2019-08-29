package Suppliers;

import Companies.CompanySuppliers;

public class SupplierTest {
	
	
	public static void main(String[] args){
		String companyname	="bulemeezi";
		String companyAdress="kiwatule";
		int profit;
		int income=100000;
		int expenditure=2000;
	
		CompanySuppliers somecompany=new CompanySuppliers();//creating a null object
		String fistname="john";
		String lastname="Doe";
		String telephone="+34 23 56 89";
		String supplierID="12-48DS";
		//for non null object
		CompanySuppliers agoodcompany=new CompanySuppliers(companyname,companyAdress,fistname,lastname,telephone,supplierID);
		
		
		profit=agoodcompany.calculateProfit(income, expenditure);
		System.out.println("Class details are :" +agoodcompany);
		System.out.println("the profit is" +profit);
		//toString() method was overridden to add full on object info
		//therefore providing print as an object implicitly calls toString and prints class props
		System.out.println("for null object \n class is :" +somecompany);
		
	}

}
