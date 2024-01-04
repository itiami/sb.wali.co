package co.wali.W3Soft.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jpa_user")
@Data // Lombok annotation to generate getters, setters, toString, equals, and
      // hashCode methods
public class User {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // to auto generate id.
    // start from 1
    private Long id;
    private String name;
    private int age;

    // No need to explicitly define constructors, getters, or setters
}
