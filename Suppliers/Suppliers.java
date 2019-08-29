package Suppliers;

import Companies.IsupplierInfo;

public abstract class Suppliers implements IsupplierInfo{
		private String firstName,lastName,email,telephone,supplierID;
		public Suppliers(String fistName,String lastName,String telephone,String supplierID){
			this.firstName=fistName;
			this.lastName=lastName;
			this.telephone=telephone;
			this.supplierID=supplierID;
		}
			
	public Suppliers() {
			// TODO Auto-generated constructor stub
		}
   
	public int calculateProfit(int income,int expenditure){
			return income-expenditure;
			
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getEmail() {
			return email;
		}


		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}


		public String getTelephone() {
			return telephone;
		}


		public void setSupplierID(String supplierID) {
			this.supplierID = supplierID;
		}


		public String getSupplierID() {
			return supplierID;
		}
	
}
