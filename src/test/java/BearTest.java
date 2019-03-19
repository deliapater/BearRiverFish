import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    public Bear bear;
    public Fish fish;
    public River river;

    @Before
    public void setup(){
        bear = new Bear("Baloo");
        fish = new Fish();
        river = new River("Clyde");
        river.add(fish);
    }

    @Test
    public void bellyStartsEmpty() {
        assertEquals(0, bear.foodCound());
    }

    @Test
    public void canEatFish(){
        bear.eat(fish);
        assertEquals(1, bear.foodCound());
    }

    @Test
    public void bearEatsFishFromRiver(){
        bear.takeFishFromRiver(river);
        assertEquals(1, bear.foodCound());
        assertEquals(0, river.fishCount());
    }

}
