import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiverTest {
    public River river;
    public Fish fish;

    @Before
    public void setup(){
        river = new River("Amazon");
    }

    @Test
    public void riverStartsEmpty() {
        assertEquals(0, river.fishCount());
    }

    @Test
    public void candAddFish(){
        river.add(fish);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canRemoveFish(){
        river.add(fish);
        river.add(fish);
        river.removeFish();
        assertEquals(1, river.fishCount());
    }
}
