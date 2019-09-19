package com.example.demo.model;

import javax.validation.constraints.Email;

import lombok.NoArgsConstructor;

@NoArgsConstructor
	public class CreateUserResponseModel {
		private String associateId;
		private String associateFirstName;
		private String associateLastName;
		private String email;
		private long associateMobilenumber;
		
		public CreateUserResponseModel() {
			super();
		}
		public CreateUserResponseModel(String associate_id, String associateFirstName, String associateLastName, String email,
				long associateMobilenumber) {
			super();
			this.associateId = associate_id;
			this.associateFirstName = associateFirstName;
			this.associateLastName = associateLastName;
			this.email = email;
			this.associateMobilenumber = associateMobilenumber;
		}
		public String getAssociateId() {
			return associateId;
		}
		public void setAssociateId(String associate_id) {
			this.associateId = associate_id;
		}
		public String getAssociateFirstName() {
			return associateFirstName;
		}
		public void setAssociateFirstName(String associateFirstName) {
			this.associateFirstName = associateFirstName;
		}
		public String getAssociateLastName() {
			return associateLastName;
		}
		public void setAssociateLastName(String associateLastName) {
			this.associateLastName = associateLastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Number getAssociateMobilenumber() {
			return associateMobilenumber;
		}
		public void setAssociateMobilenumber(long associateMobilenumber) {
			this.associateMobilenumber = associateMobilenumber;
		}
		
		

	}
	