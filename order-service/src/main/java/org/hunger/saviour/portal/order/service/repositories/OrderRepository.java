package org.hunger.saviour.portal.order.service.repositories;

import org.hunger.saviour.portal.order.service.entities.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OrderRepository extends MongoRepository<OrderEntity, UUID> {
}
