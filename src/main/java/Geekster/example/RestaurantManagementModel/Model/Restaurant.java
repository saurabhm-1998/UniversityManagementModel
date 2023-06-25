package Geekster.example.RestaurantManagementModel.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String specialty;
    private int totalStaff;
}
