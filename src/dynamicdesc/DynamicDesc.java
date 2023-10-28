package dynamicdesc;

import java.util.Random;
import arc.util.*;
import mindustry.mod.*;
import mindustry.net.Administration.*;

public class DynamicDesc extends Plugin{
    public static final String[] descs = {"Description 1", "Description 2", "Description 3", "Description 4"};
    public static final Random random = new Random();

    //called when game initializes
    @Override
    public void init(){
        Timer.schedule(new Timer.Task() {
            @Override
            public void run(){
                Config.desc.set(descs[random.nextInt(descs.length)]);
            }
        }, 0f, 0.1f);
    }
}
