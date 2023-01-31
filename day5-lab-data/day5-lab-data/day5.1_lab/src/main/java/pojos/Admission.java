package pojos;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "admissions_tbl", 
uniqueConstraints = @UniqueConstraint
(columnNames = {"course_id", "student_id"}))
public class Admission extends BaseEntity {
	@Column(name = "application_date")
	@CreationTimestamp
	private LocalDate applicationDate;
	@Column(name="result_date")
	//How to add this logic ? Result date will be 15 days after the applied date ?
	private LocalDate resultDate;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private AdmissionStatus status;
	//Admission *----->1  Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student candidate;
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course chosenCourse;

	public Admission() {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public LocalDate getResultDate() {
		return resultDate;
	}

	public void setResultDate(LocalDate resultDate) {
		this.resultDate = resultDate;
	}

	public Student getCandidate() {
		return candidate;
	}

	public void setCandidate(Student candidate) {
		this.candidate = candidate;
	}

	public Course getChosenCourse() {
		return chosenCourse;
	}

	public void setChosenCourse(Course chosenCourse) {
		this.chosenCourse = chosenCourse;
	}
	

	public AdmissionStatus getStatus() {
		return status;
	}

	public void setStatus(AdmissionStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Admission Ref ID " + getId() + " [applicationDate=" + applicationDate + ", resultDate=" + resultDate
				+ "]";
	}

}
