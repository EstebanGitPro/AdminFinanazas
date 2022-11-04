package com.mybudget.personalbudget.infrastructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybudget.personalbudget.entity.PersonEntity;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, UUID>{

}
