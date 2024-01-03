package co.wali.W3Soft.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and
      // hashCode methods
public class UserModel {
    @Id
    private Long id;
    private String name;
    private int age;

    // No need to explicitly define constructors, getters, or setters
}
