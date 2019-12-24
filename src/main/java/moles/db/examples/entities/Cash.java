package moles.db.examples.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "CASH")
public class Cash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DAY")
    private LocalDateTime day;

    @Column(name = "CASH")
    private String cash;

    @Column(name = "VALUE")
    private Double value;

}
