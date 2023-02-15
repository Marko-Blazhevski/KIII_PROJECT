package com.example.kiii_project_final;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PersonRepo extends JpaRepository<Person, Long> {
}
