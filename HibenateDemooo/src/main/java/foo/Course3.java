package foo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Entity
public class Course3 {

	@Id
	@Column(name="course_id")
	private int cid;
	@Column(name="course_name")
	private String cname;
	
	@ManyToMany(mappedBy="courses")
	private List<Student3> students=new ArrayList<Student3>();

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student3> getStudents() {
		return students;
	}

	public void setStudents(List<Student3> students) {
		this.students = students;
	}

	public Course3() {
		super();
	}
	
	
	
	
}
