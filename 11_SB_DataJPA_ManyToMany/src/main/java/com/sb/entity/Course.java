package com.sb.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course implements Serializable {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) Mysql
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ORACLE_DB_SEQ_ID")
	private Long id;

	private String title;
	private String abbreviation;
	private int modules;
	private double fee;

	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<Student> students = new HashSet<>();

	public Course() {
	}

	public Course(String title, String abbreviation, int modules, double fee) {
		this.title = title;
		this.abbreviation = abbreviation;
		this.modules = modules;
		this.fee = fee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public int getModules() {
		return modules;
	}

	public void setModules(int modules) {
		this.modules = modules;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	/*@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", abbreviation=" + abbreviation + ", modules=" + modules
				+ ", fee=" + fee + ", students=" + students + "]";
	}*/

	// getters and setters, equals(), toString() .... (omitted for brevity)
}