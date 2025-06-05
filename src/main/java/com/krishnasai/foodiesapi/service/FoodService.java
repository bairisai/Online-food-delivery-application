package com.krishnasai.foodiesapi.service;

import com.krishnasai.foodiesapi.io.FoodRequest;
import com.krishnasai.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FoodService {
    String uploadFile(MultipartFile file);
    FoodResponse addFood(FoodRequest request, MultipartFile file);
}
