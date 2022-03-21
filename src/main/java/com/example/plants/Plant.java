package com.example.plants;

public class Plant {
    private String id;
 private String type;
 private String description;
//comment - You can create empty constructor, constructor, getters and setters for all attributes by rightclick -> Java code generator
 public Plant() {
 }
 public Plant(String id, String type, String description) {
 this.id = id;
 this.type = type;
 this.description = description;
 }
 public String getId() {
 return id;
 }
 public void setId(String id) {
 this.id = id;
 }
 public String getType() {
 return type;
 }
 public void setType(String type) {
 this.type = type;
 }
 public String getDescription() {
 return description;
 }
 public void setDescription(String description) {
 this.description = description;
 }
}
