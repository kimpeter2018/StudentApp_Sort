package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		
		Student s1= new Student(101,"Kim",23);
		al.add(s1);
		Student s2= new Student(102,"Lee",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Choi",24));
		al.add(new Student(105,"Kwak",23));
		al.add(new Student(106,"Oh",22));
		al.add(new Student(107,"Kwon",21));
		al.add(new Student(108,"Jo",20));
		al.add(new Student(109,"Shin",28));
		al.add(new Student(110,"Kang",26));
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
	}

}
