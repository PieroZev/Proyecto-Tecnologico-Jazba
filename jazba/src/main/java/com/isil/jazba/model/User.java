package com.isil.jazba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_user")
@Entity
public class User {

    @Id
    private Integer dni;

    @Column
    @NotBlank
    private String username;

    @Column
    @NotBlank
    private String lastNameFather;

    @Column
    @NotBlank
    private String lastNameMother;

    @Column(unique = true)
//    @Email
    @NotBlank
    private String email;

    @Column
    private Integer phone;

    @Column
    private String password;

    @Transient
    private String passwordConfirm;

    private boolean isEnabled;

    @ManyToMany
    private Set<Role> roles;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getPassword() {
        return password;
    }

}
