package dao;

import models.Restaurant;
import models.Foodtype;
import java.util.List;

public interface RestaurantDao {

  //create
  void add (Restaurant restaurant);
  void addRestaurantToFoodtype(Restaurant restaurant, Foodtype foodtype);

  //read
  List<Restaurant> getAll();
  List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId);

  Restaurant findById(int id);

  //update
  void update(int id, String name, String address, String zipcode, String phone, String website, String email);

  //delete
  void deleteById(int id);
}
