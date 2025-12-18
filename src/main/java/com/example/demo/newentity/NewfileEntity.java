package com.example.demo.newentity;

import jakarta.persistence.Entity;

@Entity
public class NewfileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="should not contain spaces")
    
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(message="invalid format")
    private String email;
    public NewfileEntity(Long id,@NotBlank(message="should not contain spaces") String name,@NotBlank(message="no blank allowed") @Email(message="invalid format") String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public NewfileEntity(){

    }
    public Long getId(){
        return id;
    }
    public void setId(){
        return id
    }

}

