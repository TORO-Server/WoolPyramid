package marumasa.unko;

import org.bukkit.Location;
import org.bukkit.Material;

public class setBlock {
    public static void unko(int value, Location location) {

        location.add(0, -1, 0);

        for (int loopY = 0; loopY > -value; loopY--) {
            for (int loopX = loopY; loopX <= -loopY; loopX++) {
                for (int loopZ = loopY; loopZ <= -loopY; loopZ++) {
                    Location loc = location.clone();
                    loc.add(loopX, loopY, loopZ).getBlock().setType(Material.BROWN_WOOL);
                }
            }
        }
    }
}
