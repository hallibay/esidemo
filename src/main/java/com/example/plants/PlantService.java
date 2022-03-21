package com.example.plants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
  
private List<Plant> plants = new ArrayList<>(Arrays.asList(
    new Plant("01", "Heavy", "Can be used for heavy work"),
    new Plant("02", "Medium", "Can be used for medium work"),
    new Plant("03", "Light", "Can be used for light work")
 ));
 public List<Plant> getAllPlants(){
    return plants;
 }
 public Plant getPlant(String id){
    return plants.stream().filter(p->p.getId().equals(id)).findFirst().get();
 }
 public void addPlant(Plant plant) {
    plants.add(plant);
 }
 public void updatePlant(String id, Plant plant) {
    for (int i = 0; i < plants.size(); i++){
        Plant p = plants.get(i);
        if (p.getId().equals(id)){
        plants.set(i, plant);
        return;
        }
    }
 }
 public void deletePlant(String id) {
    plants.removeIf(p->p.getId().equals(id));
 }
    
}
