package com.cba.ecommuter.repository;

import com.cba.ecommuter.model.GlobalAuditEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalAuditEntryRepository extends JpaRepository<GlobalAuditEntry, Integer> {
}
