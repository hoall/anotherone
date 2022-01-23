package de.felixpaetow.anotherone.controllers;

import com.fatsecret.platform.model.CompactFood;
import de.felixpaetow.anotherone.service.FatsecretClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private FatsecretClient client;

    @GetMapping("/search")
    public List<CompactFood> searchFood(@RequestParam("foodname") String foodname) {
        return client.searchForFood(foodname);
    }

    @GetMapping("/getFood")
    public String getFood(String foodname){
        return "";
    }
}
