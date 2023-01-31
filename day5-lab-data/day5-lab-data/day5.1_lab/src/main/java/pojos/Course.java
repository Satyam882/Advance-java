package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "courses_tbl")
public class Course extends BaseEntity {
	@Column(name = "title", unique = true, length = 100)
	private String courseTitle;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;
	private double fees;
	private int capacity;
	// Course 1----->* Admission
	@OneToMany(mappedBy = "chosenCourse", 
			cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Admission> admissions = new ArrayList<>();

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String courseTitle, LocalDate startDate, LocalDate endDate, double fees, int capacity) {
		super();
		this.courseTitle = courseTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.capacity = capacity;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

	public List<Admission> getAdmissions() {
		return admissions;
	}

	public void setAdmissions(List<Admission> admissions) {
		this.admissions = admissions;
	}

	@Override
	public String toString() {
		return "Course ID " + getId() + " [courseTitle=" + courseTitle + ", startDate=" + startDate + ", endDate="
				+ endDate + ", fees=" + fees + ", capacity=" + capacity + "]";
	}

}
