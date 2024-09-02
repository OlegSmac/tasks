package com.example.demo.api.response;

import com.example.demo.model.Faculty;
import com.example.demo.model.Student;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class StudentAdminDTO extends StudentUsualDTO {
    /*
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
     */
    @JsonProperty("age")
    private int age;
    @JsonProperty("sign_contract_date")
    private Date signContractDate;
    @JsonProperty("on_budget")
    private boolean onBudget;
    /*
    @JsonProperty("abbreviation")
    private String abbr;
    @JsonProperty("faculty")
    private String faculty;
     */

    public StudentAdminDTO(Student student) {
        super(student);
        this.age = student.getAge();
        this.signContractDate = student.getSignContractDate();
        this.onBudget = student.isOnBudget();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getSignContractDate() {
        return signContractDate;
    }

    public void setSignContractDate(Date signContractDate) {
        this.signContractDate = signContractDate;
    }

    public boolean isOnBudget() {
        return onBudget;
    }

    public void setOnBudget(boolean onBudget) {
        this.onBudget = onBudget;
    }
}
