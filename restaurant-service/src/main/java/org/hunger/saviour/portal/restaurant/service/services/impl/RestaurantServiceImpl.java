package org.hunger.saviour.portal.restaurant.service.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hunger.saviour.portal.commons.dtos.RestaurantDTO;
import org.hunger.saviour.portal.restaurant.service.entities.RestaurantEntity;
import org.hunger.saviour.portal.restaurant.service.repositories.RestaurantRepository;
import org.hunger.saviour.portal.restaurant.service.services.RestaurantService;
import org.hunger.saviour.portal.restaurant.service.utilities.RestaurantMapper;
import org.hunger.saviour.portal.restaurant.service.utilities.RestaurantUtility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Override
    public void createRestaurant(RestaurantDTO restaurantDTO) {
        RestaurantEntity restaurantEntity = RestaurantMapper.INSTANCE.dtoToEntity(restaurantDTO);
        //RestaurantEntity restaurantEntity = RestaurantUtility.convertDTOToEntity(restaurantDTO);
        this.restaurantRepository.save(restaurantEntity);
    }

    @Override
    public Page<RestaurantEntity> getRestaurant(Integer offset, Integer pageSize) {
        return this.restaurantRepository.findAll(PageRequest.of(offset, pageSize));
    }
}
