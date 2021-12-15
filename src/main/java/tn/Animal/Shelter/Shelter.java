package tn.Animal.Shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

	//creation Class +attributs by iheb
	private String name ;
	private int id;
	private List<Animal>lstAnimal;

	//creation constructors by hedi
	public Shelter() {
		lstAnimal = new ArrayList<>();
	}

	public Shelter(String name, int id, List<Animal> lstAnimal) {
		this.name = name;
		this.id = id;
		this.lstAnimal = lstAnimal;
	}

	//creation Getter and Setter by Fedi
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Animal> getLstAnimal() {
		return lstAnimal;
	}

	public void setLstAnimal(List<Animal> lstAnimal) {
		this.lstAnimal = lstAnimal;
	}
}
