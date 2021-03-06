package tn.Animal.Shelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
	lstAnimal.add(a);
	}

	@Override
	public void adopt(Animal a) {
		lstAnimal.remove(a);
	}

	@Override
	public void update(Animal a) {
		for (Animal B: lstAnimal) {
			if (B.getId()==a.getId()) {
				B.setAge(a.getAge());
				B.setName(a.getName());
				B.setType(a.getType());

			}
			}
		}



	@Override
	public void getAll() {
		List <Animal>lst =getLstAnimal();
		for (int i = 0; i<lst.size();i++) {
			System.out.println(lst.get(i).getName() +","+ lst.get(i).getType());
		}
		

	}

	// function made by Houssem
	@Override
	public List<Animal> getByType(String s) {
		return lstAnimal.stream().filter(a->a.getType().equals(s)).collect(Collectors.toList());
	}

	//Vaccinated method by Fedi
	@Override
	public void vaccinate(Animal a) {
		for(Animal animal: lstAnimal)
			if (!animal.isVaccinated())
				animal.setVaccinated(true);
	}
}
