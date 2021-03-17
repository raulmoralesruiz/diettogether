package com.diettogether.repository;

import com.diettogether.model.DietReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietReportRepository extends JpaRepository<DietReport, Long> {
}
