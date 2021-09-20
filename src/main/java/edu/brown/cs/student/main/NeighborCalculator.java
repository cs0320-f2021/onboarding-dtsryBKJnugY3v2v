package edu.brown.cs.student.main;

import java.util.ArrayList;
import java.util.HashMap;

public class NeighborCalculator {

  private HashMap<String, Star> _stars;

  public NeighborCalculator(HashMap<String, Star> stars) {
    _stars = stars;
  }

  public ArrayList<Star> nearest(int k, String name) {
    Star origin = _stars.get(name);
    ArrayList<Star> nearest = new ArrayList<>();
    for (java.util.Map.Entry<String, Star> stringStarEntry : _stars.entrySet()) {
      Star neighbor = (Star) stringStarEntry;
      double distance = origin.getDistance(neighbor.getX(), neighbor.getY(), neighbor.getZ());
    }
    return nearest;
  }

  public ArrayList<Star> nearest(int k, double x, double y, double z) {
    ArrayList<Star> nearest = new ArrayList<>();
    return nearest;
  }
}
