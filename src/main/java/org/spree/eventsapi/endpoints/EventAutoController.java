package org.spree.eventsapi.endpoints;

import org.spree.core.entities.JpaEvent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventAutoController extends PagingAndSortingRepository<JpaEvent, JpaEvent.EventId>{
}
