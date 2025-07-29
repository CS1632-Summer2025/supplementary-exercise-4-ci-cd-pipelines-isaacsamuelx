package edu.pitt.cs;

import java.util.ArrayList;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	String name = "";
	int id;
	boolean isRented = false;


	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.name = name;
		this.id = id;
	}

	public void rentCat() {
		// TODO: Fill in
		if(isRented){
			
		}
		else{
			isRented = true;
		}

	}

	public void returnCat() {
		// TODO: Fill in
		if(isRented){
			isRented = false;
		}
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return name;
		//return "";
	}

	public int getId() {
		// TODO: Fill in
		return id;
		//return 0;
	}

	public boolean getRented() {
		// TODO: Fill in
		return isRented;
	}

	public String toString() {
		// TODO: Fill in
		return ("ID " + id + ". " + name);
	}

}