package com.cleevio.task.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleevio.task.Models.Watch;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Long> {
}