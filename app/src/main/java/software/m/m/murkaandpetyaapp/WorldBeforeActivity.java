package software.m.m.murkaandpetyaapp;

/**
 * Created by mac on 08.07.17.
 */

public class WorldBeforeActivity {

    public static WorldBeforeActivity instance = new WorldBeforeActivity();

    public Forest forrest;
    public Cat murka;

    private WorldBeforeActivity() {
            forrest = new Forest("forest");
            murka = new Cat();
    }
}
