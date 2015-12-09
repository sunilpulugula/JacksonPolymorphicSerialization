package com.jackson.example.demo;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.example.domain.Animal;
import com.jackson.example.domain.Lion;
import com.jackson.example.domain.Tiger;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 9/12/15
 */
public class JacksonPolymorphicSerialization {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) throws IOException {
        List<Animal> animal = new ArrayList<Animal>();
        animal.add(new Lion("lion", "roar"));
        animal.add(new Tiger("tiger", "purr"));
        animal.add(new Tiger("tiger", "purrrrrrrrr"));

        URL url = JacksonPolymorphicSerialization.class.getClassLoader().getResource("animals.json");
        File file = new File(url.getPath());
        new ObjectMapper().writeValue(file, animal);

        List<Animal> animals = new ObjectMapper().readValue(file, List.class);
        System.out.println(animals);
    }


    private static Animal getAnimal() {
        int randomNumber = RANDOM.nextInt(10);
        if (randomNumber > 5) {
            return new Lion("lion", "roar");
        }
        return new Tiger("tiger", "purr");
    }
}
