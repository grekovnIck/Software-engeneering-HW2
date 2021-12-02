package MyLib;

public class Point implements Mucha {
    private Coord2D position;
    private final BoundBox bounds;

    public Point(double x, double y) {
        position = new Coord2D(x, y);
        bounds = new BoundBox(this);

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
}
