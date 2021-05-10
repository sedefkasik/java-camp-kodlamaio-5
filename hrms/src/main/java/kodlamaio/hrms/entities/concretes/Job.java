package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Jobs")
@Data
public class Job {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="jobs_name")
	private String name;
	
	public Job() {
		super();
	}
	
	public Job(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}
