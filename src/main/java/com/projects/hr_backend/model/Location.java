package com.projects.hr_backend.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    @Column(name = "LOCATION_ID")
    private Long id;

    @Column(name = "STREET_ADDRESS", length = 40)
    private String streetAddress;

    @Column(name = "POSTAL_CODE", length = 12)
    private String postalCode;

    @Column(name = "CITY", nullable = false, length = 30)
    private String city;

    @Column(name = "STATE_PROVINCE", length = 25)
    private String stateProvince;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    @OneToMany(mappedBy = "location")
    private List<Department> departments;

}
