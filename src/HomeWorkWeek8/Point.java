package HomeWorkWeek8;

public class Point
{

    int x,y;
    Point p1;

    public Point()
    {

    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double distance()
    {
        double dis = Math.sqrt((x*x)+(y*y));
        return dis;
    }

    public double distance(double x, double y)
    {
        //Math.sqrt((x*x)+(y*y));
        double dis = Math.sqrt((this.x - x)*(this.x-x)+(this.y-y)*(this.y - y));
        return dis;

    }
    public double distance(Point second)
    {
        double dis = second.distance(this.x,this.y);
        return dis;
    }

    public static void main(String[] args)
    {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}

