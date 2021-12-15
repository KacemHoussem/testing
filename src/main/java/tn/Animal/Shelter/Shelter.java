package tn.Animal.Shelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shelter implements InterfaceShelter{

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


	//Creation equals and toString by Nour
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Shelter shelter = (Shelter) o;
		return id == shelter.id;
	}

	@Override
	public String toString() {
		return "Shelter{" +
				"name='" + name + '\'' +
				", id=" + id +
				", lstAnimal=" + lstAnimal +
				'}';
	}

	@Override
	public void rescue(Animal a) {

	}

	@Override
	public void adopt(Animal a) {

	}

	@Override
	public void update(Animal a) {

	}

	@Override
	public void getAll() {
		List <Animal>lst =getLstAnimal();
		for (int i = 0; i<lst.size();i++) {
			System.out.println(lst.get(i).getName() +","+ lst.get(i).getType());
		}
		

	}

	@Override
	public List<Animal> getByType(String s) {
		return null;
	}

	@Override
	public void vaccinate(Animal a) {

	}
}
