package com.xworkz.ArrayCrudApplications.Dao;

import org.springframework.stereotype.Component;

import com.xworkz.ArrayCrudApplications.Dto.RegisterDto;

@Component
public class ArrayCrudDao {

	RegisterDto dtos[] = new RegisterDto[2];
	int index = 0;

	// saving data
	public boolean save(RegisterDto data) {
		dtos[index] = data;
		index++;
		System.out.println("saving data ");
		return true;

	}

	// display all method
	public boolean display() {

		for (int i = 0; i < dtos.length; i++) {

			if (dtos[i] != null) {
				System.out.println("-------------------");
				System.out.println("data are displaying");
				System.out.println(dtos[i].getId());
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPass());
				System.out.println("-------------------");
				System.out.println();
			}
		}
		return true;

	}

	// display by id
	public void displayById(int id) {

		System.out.println("display by ID method invoked");
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				System.out.println("-------------------");
				System.out.println("This ID belongs to : ");
				System.out.println(dtos[i].getId());
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPass());
				System.out.println("-------------------");

			}

		}
	}

	// display by name
	public void displayByName(String name) {

		System.out.println("display by name method invoked");
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getName().equals(name)) {
				System.out.println("-------------------");
				System.out.println("This name belongs to : ");
				System.out.println(dtos[i].getId());
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPass());
				System.out.println("-------------------");

			}

		}
	}

	// display by Contact number
	public void displayByContact(long contact) {

		System.out.println("display by Contact method invoked");
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getContact() == contact) {
				System.out.println("-------------------");
				System.out.println("This contact numbers belongs to : ");
				System.out.println(dtos[i].getId());
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPass());
				System.out.println("-------------------");

			}

		}
	}

	// display by email id
	public void displayByEmail(String email) {

		System.out.println("display by email method invoked");
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getEmail().equals(email)) {
				System.out.println("-------------------");
				System.out.println("This email belongs to : ");
				System.out.println(dtos[i].getId());
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPass());
				System.out.println("-------------------");

			}

		}
	}

	// update by id
	public void updateById(int id, long contact) {
		System.out.println();
		System.out.println("update method invoked");
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getId() == id) {
				dtos[i].setContact(contact);
				System.out.println("updated succesfuly");

			}
		}

	}
	//delete by name
	public void deleteByName(String name) {
		System.out.println();
		System.out.println("delete method invoked");
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getName().equals(name)) {
				dtos[i] = null;
				System.out.println("item is deleted");
				

			}

		}

	}

}
