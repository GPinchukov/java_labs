package by.akarumey.project.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;

    @OneToMany(cascade = ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id", nullable = false)
    private List<Role> authorities;

    @NotBlank
    @Column(nullable = false)
    private String name;

    //    @Pattern(regexp = "")
    private String phoneNumber;
}
