package edu.brown.cs.student.main;

public class Star {

  private String _starID;
  private String _name;
  private String _x;
  private String _y;
  private String _z;

  public Star(String starID, String name, String x, String y, String z) {
    _starID = starID;
    _name = name;
    _x = x;
    _y = y;
    _z = z;
  }

  public int getID() {
    return Integer.parseInt(_starID);
  }

  public String getName() {
    return _name;
  }

  public double getX() {
    return Double.parseDouble(_x);
  }

  public double getY() {
    return Double.parseDouble(_y);
  }

  public double getZ() {
    return Double.parseDouble(_z);
  }
}