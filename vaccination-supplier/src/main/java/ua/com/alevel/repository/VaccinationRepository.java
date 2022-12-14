package ua.com.alevel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.alevel.entity.Vaccination;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination, Long> { }
