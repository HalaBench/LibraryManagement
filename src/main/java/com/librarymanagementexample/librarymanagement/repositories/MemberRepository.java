package com.librarymanagementexample.librarymanagement.repositories;

import com.librarymanagementexample.librarymanagement.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
