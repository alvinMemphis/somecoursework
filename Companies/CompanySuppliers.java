package Companies;

import Suppliers.Suppliers;

public class CompanySuppliers extends Suppliers{
	private String companyname,companyAdress;
	
	public CompanySuppliers(String companyname,String companyadress,String fistName,String lastName,String telephone,String supplierID){
		super(fistName,lastName,telephone,supplierID);
		this.setCompanyname(companyname);
		this.setCompanyAdress(companyadress);
	}
	
	


	public CompanySuppliers() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyAdress(String companyAdress) {
		this.companyAdress = companyAdress;
	}

	public String getCompanyAdress() {
		return companyAdress;
	}
	public String supplierInfo() {
		
		return null;
	}
	public int calculateProift(int income, int expenditure) {
	
		return income-expenditure+2000;
	}
	
	@Override
	public String toString() {
		return "CompanySuppliers [companyname=" + companyname
				+ ", companyAdress=" + companyAdress + ", getCompanyname()="
				+ getCompanyname() + ", getCompanyAdress()="
				+ getCompanyAdress() + ", supplierInfo()=" + supplierInfo()
				+ "]";
	}



	public String supplierInfo(int income, int expenditure) {
		
		return toString();
	}

	
	

}
