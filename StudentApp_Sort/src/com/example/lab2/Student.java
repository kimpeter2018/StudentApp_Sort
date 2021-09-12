package com.example.lab2;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		super();
		this.no =no;
		this.name=name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
}
