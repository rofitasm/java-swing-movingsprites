package id.ac.its.rofita.movingsprites;

import java.util.ArrayList;
import java.util.List;

public class Asteroid extends Sprite {

    private List<Asteroid> asteroids;
    private final int INITIAL_X = 400;

    public Asteroid(int x, int y) {
        super(x, y);
        
        initAsteroid();
    }

    private void initAsteroid() {

    	asteroids = new ArrayList<>();
        
        loadImage("src/resources/ast.jpg"); 
        getImageDimensions();
    }

    public void move() {
    	if (x < 0) {
            x = INITIAL_X;
        }
    	
    	x = x-1;
    }

    public List<Asteroid> getAsteroids() {
        return asteroids;
    }

}