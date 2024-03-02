package org.hunger.saviour.portal.restaurant.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "restaurants_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantMenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Integer restaurantMenuId;
    @Column(name = "item_name")
    private String menuItem;
    @Column(name = "description")
    private String description;
    @Column(name = "item_image_url")
    private String menuImageUrl;
    @Column(name = "menu_type")
    private String menuType;
    @Column(name = "menu_item_price")
    private Double menuItemPrice;

//    @ManyToOne
//    @JoinColumn(name = "restaurant_id")
//    private RestaurantEntity restaurant;
}
