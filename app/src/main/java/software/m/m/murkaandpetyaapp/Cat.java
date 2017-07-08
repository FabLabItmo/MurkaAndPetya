package software.m.m.murkaandpetyaapp;

import java.util.HashSet;

/**
 * Created by mac on 08.07.17.
 */

public class Cat {

    private String location;
    private HashSet<LocationListener> listeners = new HashSet<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyLocationListeners();
    }

    public void addLocationListener(LocationListener locationListener){
        listeners.add(locationListener);
    }

    private void notifyLocationListeners(){
        for (LocationListener listener : listeners){
            listener.onLocationChange(this, location);
        }
    }
}
