/** A class that represents a path via pursuit curves. */
public class Path {

    private Point curr;
    private Point next;

    public Path(double x, double y) {
        this.curr = new Point(x, y);
        this.next = this.curr;
    }

    /** Returns the x-coordinate of curr. */
    public double getCurrX() {
        return curr.getX();
    }

    /** Returns the y-coordinate of curr. */
    public double getCurrY() {
        return curr.getY();
    }

    /** Returns the x-coordinate of next. */
    public double getNextX() {
        return next.getX();
    }

    /** Returns the x-coordinate of next. */
    public double getNextY() {
        return next.getY();
    }

    /** Returns the x-coordinate of next. */
    public Point getCurrentPoint() {
        return curr;
    }

    /** set the current point to point. */
    public void setCurrentPoint(Point point) {
        this.curr = point;
    }

    public void iterate(double dx, double dy) {
        this.curr = this.next;
        this.next = new Point(this.curr.getX()+dx, this.curr.getY()+dy);
    }
}
