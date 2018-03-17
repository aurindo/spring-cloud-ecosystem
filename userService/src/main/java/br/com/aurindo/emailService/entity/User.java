package br.com.aurindo.emailService.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="user_app")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "userGenerator")
	@TableGenerator(name = "userGenerator", allocationSize = 1)
	private Long id;

	@NotNull
	private String name;

	@NotNull
    private String login;

	@NotNull
    private String password;

	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date createDate;

	@NotNull
	@Email
    private String email;

	@NotNull
    private Boolean adminFlag;

	public User() {}

	public User(Long userId) {
		this.id = userId;
	}

	private Date updatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(Boolean adminFlag) {
		this.adminFlag = adminFlag;
	}
}
