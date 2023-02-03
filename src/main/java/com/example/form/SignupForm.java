package com.example.form;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;


@Data
public class SignupForm {
	private String userId;
	private String password;
	private String userName;
	
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;
	private Integer age;
	private Integer gender;
}

