package app.model;

import java.util.Date;

public class User extends Person {
	
	private String email;
	private String password;
	
	private Date birth ;
	private String gender;
	
	private boolean isAdmin;

	private String[] skills;
	private String[] jobs;
	
	public User(String name, String email, String password, Date birth, String gender, boolean isAdmin) {
		super(name);
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
		this.birth = birth;
		this.gender = gender;
		
		
		skills = new String[] {"JAVA", "HASKELL", "PYTHON", "JAVASCRIPT", "RACKET"};
		jobs = new String[] {"HALF OF FAME ", "SOMEWHER ELSE.."};
				
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	
	
	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String[] getJobs() {
		return jobs;
	}

	public void setJobs(String[] jobs) {
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", birth=" + birth + ", gender=" + gender
				+ ", isAdmin=" + isAdmin + "]";
	}

	public String getPhone() {
		return "555 555 4200";
	}

	public String getAddress() {
		return "Amsterdan, NEd";
	}

	public String getSite() {
		return "https://www.liveforeat.com/";
	}

}
