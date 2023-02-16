package br.com.erudio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(name = "first_name", length = 80)
    private String firstName;

    @NotNull
    @NotBlank
    @Column(name = "last_name", length = 80)
    private String lastName;

    @NotNull
    @NotBlank
    @Column(length = 100)
    private String address;

    @NotNull
    @NotBlank
    @Column(length = 6)
    private String gender;
}
