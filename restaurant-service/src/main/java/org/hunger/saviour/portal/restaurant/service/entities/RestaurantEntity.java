package org.hunger.saviour.portal.restaurant.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "restaurants")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantEntity {
    @Id
    @SequenceGenerator(name = "rest_seq", sequenceName = "restaurant_sequence", initialValue = 20100, allocationSize = 1)
    @GeneratedValue(generator = "rest_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "restaurant_id")
    private Integer restaurantId;
    @Column(name = "restaurant_name")
    private String restaurantName;
    @Column(name = "restaurant_description")
    private String restaurantDescription;
    @Column(name = "rating")
    private String rating;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "location")
    private String location;

    @ElementCollection
    private List<String> menuTypes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private List<RestaurantMenuEntity> menuItems;
}
