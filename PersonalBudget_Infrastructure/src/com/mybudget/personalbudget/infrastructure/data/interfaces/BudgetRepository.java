package com.mybudget.personalbudget.infrastructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybudget.personalbudget.entity.BudgetEntity;


@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, UUID>{

}
 