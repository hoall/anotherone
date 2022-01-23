package de.felixpaetow.anotherone.service;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Component
public class FatsecretClient {

    private FatsecretService service;

    public List<CompactFood> searchForFood(String food) {
        Response<CompactFood> compactFoodResponse = service.searchFoods(food);
        return compactFoodResponse.getResults();
    }
}
