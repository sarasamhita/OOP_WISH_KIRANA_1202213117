public class Calculation implements Runnable {
    private double radius, side, area;
    private final double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
          throw new IllegalArgumentException("\nIllegalArgumentException: Side cannot be smaller than 1");
        }
        this.area = side * side;
      }
  
      public double getSquare() {
        return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
          throw new IllegalArgumentException("\nIllegalArgumentException: Radius cannot be smaller than or equal to 1");
        }
        this.area = phi * radius * radius;
    }

    public void setTrapezoid(double lower, double upper, double height) throws IllegalArgumentException {
        if (lower < 1 || upper < 1 || height < 1) {
          throw new IllegalArgumentException("\nIllegalArgumentException: Both sides and height cannot be smaller than 1");
        }
        this.area = ((lower + upper) * height) / 2;
      }
  
      public double getTrapezoid() {
        return this.area;
    }
  
    public double getRadius() {
      return radius;
    }

    public void setRadius(double radius) {
      this.radius = radius;
    }

    public double getSide() {
      return side;
    }

    public void setSide(double side) {
      this.side = side;
    }

    public double getArea() {
      return area;
    }

    public void setArea(double area) {
      this.area = area;
    }

    public double getPhi() {
      return phi;
    }

    public double getCircle() {
      return this.area;
    }

    @Override
    public void run() {
      System.out.println("\n====Program will start in====");
      for (int starting = 3; starting > 0; starting--) {
        try {
          System.out.println("Starting with thread "+starting);
          Thread.sleep(1500);
        } catch (InterruptedException e) {
          System.out.println("Error");
        }
      }
    }
}