package edu.brown.cs.student.main;

public class Star {

  private int _starID;
  private String _name;
  private double _x;
  private double _y;
  private double _z;

  public void Star(int starID, String name, double x, double y, double z) {
    _starID = starID;
    _name = name;
    _x = x;
    _y = y;
    _z = z;
  }

  public int getID() {
    return _starID;
  }

  public String getName() {
    return _name;
  }

  public double getX() {
    return _x;
  }

  public double getY() {
    return _y;
  }

  public double getZ() {
    return _z;
  }
}