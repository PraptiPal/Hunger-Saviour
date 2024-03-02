package org.hunger.saviour.portal.restaurant.service.apis;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hunger.saviour.portal.restaurant.service.dtos.RestaurantDTO;
import org.hunger.saviour.portal.restaurant.service.services.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("restaurants")
@RequiredArgsConstructor
@Slf4j
public class RestaurantAPI {

    private final RestaurantService restaurantService;

    @PostMapping
    public ResponseEntity<?> createRestaurant(@Valid @RequestBody String restaurantDTO){
        //this.restaurantService.createRestaurant(restaurantDTO);
        log.info(restaurantDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{offset}/{pageSize}")
    public void getRestaurant(@PathVariable Integer offset, @PathVariable Integer pageSize){

    }
}
