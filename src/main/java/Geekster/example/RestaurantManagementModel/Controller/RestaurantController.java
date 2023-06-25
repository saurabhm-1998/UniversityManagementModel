package Geekster.example.RestaurantManagementModel.Controller;

import Geekster.example.RestaurantManagementModel.Model.Restaurant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private List<Restaurant> restaurantList = new ArrayList<>();

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
        Restaurant restaurant = findRestaurantById(id);
        if (restaurant != null) {
            return ResponseEntity.ok(restaurant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        return ResponseEntity.ok(restaurantList);
    }

    @PostMapping
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
        restaurantList.add(restaurant);
        return ResponseEntity.ok(restaurant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurant> updateRestaurantSpecialty(
            @PathVariable Long id,
            @RequestParam String specialty) {
        Restaurant restaurant = findRestaurantById(id);
        if (restaurant != null) {
            restaurant.setSpecialty(specialty);
            return ResponseEntity.ok(restaurant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id) {
        Restaurant restaurant = findRestaurantById(id);
        if (restaurant != null) {
            restaurantList.remove(restaurant);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private Restaurant findRestaurantById(Long id) {
        return restaurantList.stream()
                .filter(restaurant -> restaurant.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
