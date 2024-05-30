// GeometricObject.java

// Import Comparable interface
public abstract class GeometricObject implements Comparable<GeometricObject> {
  private String color = "white";
  private boolean filled;

  /**Default constructor*/
  protected GeometricObject() {
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
  }

  /**Getter method for color*/
  public String getColor() {
      return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
      this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
   so, the get method name is isFilled*/
  public boolean isFilled() {
      return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
      this.filled = filled;
  }

  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();

  // Override compareTo method
  @Override
  public int compareTo(GeometricObject o) {
      // Compare by area
      if (this.getArea() < o.getArea())
          return -1;
      else if (this.getArea() > o.getArea())
          return 1;
      else
          return 0;
  }
}
