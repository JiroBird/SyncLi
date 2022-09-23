package com.github.jirobird.syncli.repository;

import com.github.jirobird.syncli.entity.SyncedListItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyncedListItemRepository extends JpaRepository<SyncedListItem, Long> {

}
