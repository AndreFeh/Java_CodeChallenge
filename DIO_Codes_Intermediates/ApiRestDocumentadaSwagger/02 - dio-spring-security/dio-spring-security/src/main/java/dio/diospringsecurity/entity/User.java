package dio.diospringsecurity.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity                     //Declarando uma entidade
@Table(name = "tab_user")   //Definindo Tabela
public class User {
    @Id //Definindo PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;
    @Column(length = 50, nullable = false) // Nao pode ser nula
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tab_user_roles", joinColumns = @JoinColumn(name = "user_id"))
    //^^-> dizendo que essa lista vai ser a lista de Roles de um usuario, que pode ser editada, por ser uma list
    @Column(name = "role_id")
    private List<String> roles = new ArrayList<>();

    public User(){

    }
    public User(String username){
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}