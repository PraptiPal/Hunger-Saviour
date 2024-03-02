package org.hunger.saviour.portal.restaurant.service.utilities;

import org.hunger.saviour.portal.commons.dtos.RestaurantDTO;
import org.hunger.saviour.portal.restaurant.service.entities.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Map;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    RestaurantDTO entityToDto(RestaurantEntity restaurantEntity);
    RestaurantEntity dtoToEntity(RestaurantDTO restaurantDTO);
}
