package org.hunger.saviour.portal.restaurant.service.utilities;

import org.hunger.saviour.portal.commons.dtos.RestaurantDTO;
import org.hunger.saviour.portal.commons.dtos.RestaurantMenuDTO;
import org.hunger.saviour.portal.restaurant.service.entities.RestaurantEntity;
import org.hunger.saviour.portal.restaurant.service.entities.RestaurantMenuEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantUtility {

    public static RestaurantEntity convertDTOToEntity(RestaurantDTO restaurantDTO){
        List<RestaurantMenuEntity> restaurantMenuEntityList = new ArrayList<>();

        RestaurantMenuEntity restaurantMenuEntity= RestaurantMenuEntity.builder()
                .description(restaurantDTO.getRestaurantDescription())
                .menuImageUrl(restaurantDTO.getImageUrl()).build();

        for(RestaurantMenuDTO restaurantMenuDto: restaurantDTO.getMenuItems()){
            restaurantMenuEntity.setMenuItem(restaurantMenuDto.getMenuItem());
            restaurantMenuEntityList.add(restaurantMenuEntity);
        }
        return RestaurantEntity.builder()
                .restaurantName(restaurantDTO.getRestaurantName())
                .rating(restaurantDTO.getRating())
                .location(restaurantDTO.getLocation())
                .imageUrl(restaurantDTO.getImageUrl())
                .menuItems(restaurantMenuEntityList)
                .menuTypes(restaurantDTO.getMenuTypes())
                .build();
    }

    public static RestaurantDTO convertEntityToDTO(RestaurantEntity restaurantEntity){

        List<RestaurantMenuDTO> restaurantMenuDTOList = new ArrayList<>();

        RestaurantMenuDTO restaurantMenuDTO = RestaurantMenuDTO.builder()
                .description(restaurantEntity.getRestaurantDescription())
                .menuImageUrl(restaurantEntity.getImageUrl()).build();

        for(RestaurantMenuEntity restaurantMenuEntity: restaurantEntity.getMenuItems()){
            restaurantMenuDTO.setMenuItem(restaurantMenuEntity.getMenuItem());
            restaurantMenuDTOList.add(restaurantMenuDTO);
        }

        return RestaurantDTO.builder()
                .restaurantName(restaurantEntity.getRestaurantName())
                .rating(restaurantEntity.getRating())
                .location(restaurantEntity.getLocation())
                .imageUrl(restaurantEntity.getImageUrl())
                .menuItems(restaurantMenuDTOList)
                .menuTypes(restaurantEntity.getMenuTypes())
                .build();
    }
}
