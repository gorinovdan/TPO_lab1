package com.lasat.task3;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class DomainModelTest {

    @Test
    public void testFirst() {
        String description = "Место";
        Shadows gloom = new Shadows((TypeOfShadows.GLOOM));
        People people = new People("они", false, 5);
        people.setState(", в котором");
        people.setAction("теперь находились,");
        Place place = new Place(description);
        place.setState(people.toString());
        place.setShadows(gloom);
        place.setAction("было погружено во");
        System.out.println(place);
        assertEquals("Место, в котором они теперь находились, было погружено во мрак", place.toString());
    }

    @Test
    public void testSecond() throws Exception {
        People people = new People("них",false, 10);
        int transparency = 34;
        String fogDescription = "туман";
        String state = "вился вокруг " + people.getDescription();
        Fog fog = new Fog(transparency, fogDescription, state);
        System.out.println(fog);
        assertEquals("Темный туман вился вокруг них", fog.toString());

        Shadows mist = new Shadows(TypeOfShadows.MIST);
        Shadows shadows = new Shadows(TypeOfShadows.SHADOWS);
        shadows.setDescription("слоноподобные");
        String placeDescription = "во " + mist.getTypeOfShadows().getTitle() + " ";
        Place place = new Place(placeDescription);
        place.setAction("шевелились");
        place.setShadows(shadows);
        System.out.println(place);
        assertEquals("во мгле шевелились слоноподобные тени", place.toString());
    }

    @Test
    public void testThird() {
        Entities air = new Entities(TypeOfEntities.AIR);
        Entities creatures1 = new Entities(TypeOfEntities.CREATURES);
        Entities creatures2 = new Entities(TypeOfEntities.CREATURES);
        Sounds sounds = new Sounds(10, "звуками");
        creatures1.setDescription("призрачных");
        creatures2.setDescription("призрачных");
        creatures1.setAction("убивающих других");
        sounds.setSource(creatures1.toString() + " " + creatures2.toString());
        air.setAction("то и дело наполнялся" + " " + sounds);
        System.out.println(air);
        assertEquals("Воздух то и дело наполнялся звуками призрачных существ убивающих других призрачных существ", air.toString());
    }

    @Test
    public void testFour() {
        People people = new People("люди", true,10);
        people.setState("Вероятно, находились");
        System.out.println(people);
        assertEquals("Вероятно, находились люди, которым хотелось бы за это заплатить", people.toString());
    }

    @Test
    public void testExcFirst() {
        String description = "Место";
        Shadows gloom = new Shadows((TypeOfShadows.GLOOM));
        People people = new People("они", true, 2);
        people.setState(", в котором");
        people.setAction("теперь находились,");
        Place place = new Place(description);
        place.setState(people.toString());
        place.setShadows(gloom);
        place.setAction("было погружено во");
        System.out.println(place);
        assertEquals("Место, в котором они теперь находились, было погружено во мрак", place.toString());
    }

    @Test
    public void testEscSecond() {
        People people = new People("них",false, 10);
        int transparency = 100500;
        String fogDescription = "туман";
        String state = "вился вокруг " + people.getDescription();
        Fog fog = new Fog(transparency, fogDescription, state);
        System.out.println(fog);
        assertEquals("Темный туман вился вокруг них", fog.toString());

        Shadows mist = new Shadows(TypeOfShadows.MIST);
        Shadows shadows = new Shadows(TypeOfShadows.SHADOWS);
        shadows.setDescription("слоноподобные");
        String placeDescription = "во " + mist.getTypeOfShadows().getTitle() + " ";
        Place place = new Place(placeDescription);
        place.setAction("шевелились");
        place.setShadows(shadows);
        System.out.println(place);
        assertEquals("во мгле шевелились слоноподобные тени", place.toString());
    }

    @Test
    public void testExcThird() {
        Entities air = new Entities(TypeOfEntities.AIR);
        Entities creatures1 = new Entities(TypeOfEntities.CREATURES);
        Entities creatures2 = new Entities(TypeOfEntities.CREATURES);
        Sounds sounds = new Sounds(7, "звуками");
        creatures1.setDescription("призрачных");
        creatures2.setDescription("призрачных");
        creatures1.setAction("убивающих других");
        sounds.setSource(creatures1.toString() + " " + creatures2.toString());
        air.setAction("то и дело наполнялся" + " " + sounds);
        System.out.println(air);
        assertEquals("Воздух то и дело наполнялся звуками призрачных существ убивающих других призрачных существ", air.toString());
    }

    @Test
    public void testExcFour() {
        People people = new People("люди", true,1);
        people.setState("Вероятно, находились");
        System.out.println(people);
        assertEquals("Вероятно, находились люди, которым хотелось бы за это заплатить", people.toString());
    }

}
