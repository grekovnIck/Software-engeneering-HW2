package MyLib;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Origin implements Mucha {
    private Coord2D position;
    private final BoundBox bounds;
    private Set<Mucha> children;

    public Origin(double x, double y, Set<Mucha> children) {
        position = new Coord2D(x, y);
        bounds = new BoundBox(this);
        this.children = children;
    }
    @Override
    public Coord2D getPosition() {
        return position;
    }

    @Override
    public void setPosition(Coord2D newCoord) {
        position = newCoord;
    }

    @Override
    public BoundBox getBounds() {
        return bounds;
    }

    public void add(Origin origin) {
        children.add(origin);
    }

    public void add(Point point) {
        children.add(point);
    }

    public void remove(Point point) {
        children.remove(point);
    }

    public void remove(Origin origin) {
        children.remove(origin);
    }
}
