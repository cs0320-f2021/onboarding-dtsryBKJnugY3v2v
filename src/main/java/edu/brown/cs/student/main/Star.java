package edu.brown.cs.student.main;

import java.util.Comparator;

public class Star implements Comparator<Star>, Comparable<Star> {

  private int _starID;
  private String _name;
  private double _x;
  private double _y;
  private double _z;

  public Star(String starID, String name, String x, String y, String z) {
    _starID = Integer.parseInt(starID);
    _name = name;
    _x = Double.parseDouble(x);
    _y = Double.parseDouble(y);
    _z = Double.parseDouble(z);
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

  public double getDistance(double x2, double y2, double z2) {
    double distance = 0;
    distance = Math.sqrt(Math.pow((x2 - _x), 2)
        + Math.pow((y2 - _y), 2) + Math.pow((z2 - _z), 2));
    return distance;
  }

  @Override


}