package edu.brown.cs.student.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class NeighborCalculator {

  private HashMap<String, Star> _stars;

  public NeighborCalculator(HashMap<String, Star> stars) {
    _stars = stars;
  }

  public ArrayList<Star> nearest(int k, String name) {
    Star origin = _stars.get(name);
    ArrayList<Star> nearest = new ArrayList<>();
    Iterator starIt = _stars.entrySet().iterator();
    return nearest;
  }

  public ArrayList<Star> nearest(int k, double x, double y, double z) {
    ArrayList<Star> nearest = new ArrayList<>();
    return nearest;
  }
}
