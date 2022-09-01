package com.github.jirobird.syncli.repository;

import com.github.jirobird.syncli.entity.SyncedList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyncedListRepository extends JpaRepository<SyncedList, Long> {

}
