package org.hunger.saviour.portal.commons.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Validated
public class RestaurantDTO {

    private Integer restaurantId;
    @NotBlank(message = "Restaurant name cannot be blank")
    private String restaurantName;

    @NotBlank(message = "Restaurant description cannot be blank")
    private String restaurantDescription;

    private String rating;
    @NotBlank(message = "Restaurant Image is mandatory")
    private String imageUrl;

    @NotBlank(message = "Restaurant location is mandatory")
    private String location;

    @NotBlank(message = "Restaurant menu types is mandatory")
    private List<String> menuTypes;

    @NotBlank(message = "Restaurant menu items is mandatory")
    private List<RestaurantMenuDTO> menuItems;
}
