package MyLib;

import java.nio.charset.CoderResult;

public class BoundBox {
    private double x_start;
    private double x_end;
    private double y_start;
    private double y_end;

    // private double x_start;
    // private double y_end;
    private Coord2D top_left;

    // private double x_end;
    // private double y_start;
    private Coord2D low_right;

    public BoundBox(Origin origin) {


    }

    public BoundBox(double x_start, double x_end, double y_start, double y_end) {
        this.x_start = x_start;
        this.x_end = x_end;
        this.y_start = y_start;
        this.y_end = y_end;
    }

    /*public CalcBoundBox(Origin origin) {

    }*/

    public BoundBox(Point point) {
        x_end = point.getPosition().getX();
        x_start = point.getPosition().getX();
        y_start = point.getPosition().getY();
        y_end = point.getPosition().getY();
    }
}
