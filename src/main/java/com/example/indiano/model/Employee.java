package com.example.indiano.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //(para que os  métodos Getters and Setters sejam criados automaticamente/dinamicamente. Daí precisa importar o lombok.Data)
@AllArgsConstructor // Cria automaticamente/dinamicamente o Construtor com os atributos
@NoArgsConstructor // Cria automaticamente/dinamicamente o Construtor Default
@Entity
@Table (name = "employees")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "first_name") // nome do campo na Tabela
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "email_id")
    private String emailId;

    // public Employee() {
		
	// }    

    // public Employee(long id, String firstName, String lastName, String emailId) {
    //     this.id = id;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.emailId = emailId;
    //  }
    // // public long getId() {
    // //     return id;
    // // }
    // // public void setId(long id) {
    // //     this.id = id;
    // // }
    // public String getFirstName() {
    //     return firstName;
    // }
    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }
    // public String getLastName() {
    //     return lastName;
    // }
    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }
    // public String getEmailId() {
    //     return emailId;
    // }
    // public void setEmailId(String emailId) {
    //     this.emailId = emailId;
    // }

    
}
