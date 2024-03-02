package org.hunger.saviour.portal.restaurant.service.services;

import org.hunger.saviour.portal.commons.dtos.RestaurantDTO;
import org.hunger.saviour.portal.restaurant.service.entities.RestaurantEntity;
import org.springframework.data.domain.Page;

public interface RestaurantService {

    void createRestaurant(RestaurantDTO restaurantDTO);
    Page<RestaurantEntity> getRestaurant(Integer offset, Integer pageSize);
}
