package com.tyy.hashcode;

public class Person { 
	
	int id;
	String name;
	
	
//Alto+shift+s+o
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		//return "Person [id=" + id + ", name=" + name + "]";
		return id+"=="+name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

    

	/*
	 * @Override public int hashCode() { //return 1000;//improper coding return id;
	 * }
	 */
	
	

}
