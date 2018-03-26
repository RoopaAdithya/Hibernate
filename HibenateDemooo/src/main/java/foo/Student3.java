package foo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student3 {

	@Id
	@Column(name="student_id")
	private int sid;
	@Column(name="student_name")
	private String sname;
	
	@ManyToMany
	private List<Course3> courses=new ArrayList<Course3>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course3> getCourses() {
		return courses;
	}

	public void setCourses(List<Course3> courses) {
		this.courses = courses;
	}

	public Student3() {
		super();
	}
	
	
	
	
}
