package edu.fanshawe.pawsomecare.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="pet_service")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Service {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String serviceName;

    @OneToMany(mappedBy="service")
    private List<Appointment> appointments;

}
