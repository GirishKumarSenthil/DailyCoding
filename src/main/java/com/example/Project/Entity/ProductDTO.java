package com.example.Project.Entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {
    public ProductDTO(){}
    @NotEmpty(message = "The name is required")
    private String name;

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @NotEmpty(message = "The category is required")
    private String categoty;

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }

    @Min(0)
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Size(min=10,message = "The description should be atleast 10 characters")
    @Size(max=2000,message = "The description should be max 2000 characters")

    private String description;
    private MultipartFile ImageFieldName;

    public MultipartFile getImageFieldName() {
        return ImageFieldName;
    }

    public void setImageFieldName(MultipartFile imageFieldName) {
        ImageFieldName = imageFieldName;
    }
}
