package dynamicdesc;

import java.util.Random;
import arc.util.*;
import mindustry.mod.*;
import mindustry.net.Administration.*;

public class DynamicDesc extends Plugin{
    public static final String[] descs = {"[black]hi sisters!!", "[white]'desc' [gray]is currently off", "[blue]i use arch btw", "[lightgray]we are a totally peaceful racist group", "[red]Connection error: [orange]Server unreachable. Is this address spelled correctly?", "[lightgray]building is temporarily [red]disabled [lightgray]due to a exploit.", "[lightgray]this is [white]christian server[lightgray], do not swear", "[lightgray]abcd", "[acid]BUILD SUCCESSFUL in 2s", "[lightgray]friendship ended with [acid]BOBUX[lightgray]. now [white]KROMER [lightgray]is my best friend."};
    public static final Random random = new Random();

    //called when game initializes
    @Override
    public void init(){
        Timer.schedule(new Timer.Task() {
            @Override
            public void run(){
                Config.desc.set("[SURVIVAL] " + descs[random.nextInt(descs.length)]);
            }
        }, 0f, 0.1f);
    }
}
