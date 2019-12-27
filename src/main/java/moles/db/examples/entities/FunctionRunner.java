package moles.db.examples.entities;

import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Immutable
@Subselect(
        "SELECT 0 as ID"
)
public class FunctionRunner {

    @Id
    @Column(name = "ID")
    private Integer id;
}
