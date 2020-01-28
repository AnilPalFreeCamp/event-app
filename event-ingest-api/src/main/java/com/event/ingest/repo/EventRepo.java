package com.event.ingest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.event.ingest.entity.Event;

@Component
public interface EventRepo extends CrudRepository<Event, Long> {

}
