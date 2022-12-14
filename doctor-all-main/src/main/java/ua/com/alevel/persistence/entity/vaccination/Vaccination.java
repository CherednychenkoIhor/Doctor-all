package ua.com.alevel.persistence.entity.vaccination;

import ua.com.alevel.persistence.entity.BaseEntity;
import ua.com.alevel.persistence.entity.patient.Patient;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "vaccinations")
public class Vaccination extends BaseEntity {

    private Long vaccinationId;
    private String name;
    private Integer quantity;

    @Column(name = "image_url")
    private String imageUrl;

    private String manufacturer;

    @Column(name = "method_of_administration")
    private String methodOfAdministration;

    @ManyToMany(mappedBy = "patientVaccinations", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Patient> patients;

    public Vaccination() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMethodOfAdministration() {
        return methodOfAdministration;
    }

    public void setMethodOfAdministration(String methodOfAdministration) {
        this.methodOfAdministration = methodOfAdministration;
    }

    public Long getVaccinationId() {
        return vaccinationId;
    }

    public void setVaccinationId(Long vaccinationId) {
        this.vaccinationId = vaccinationId;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vaccination that = (Vaccination) o;
        return Objects.equals(name, that.name) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, quantity);
    }
}
