package app.start.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class driver {
    @Id
    Long id;
    String name;
    Date birthDate;
}
