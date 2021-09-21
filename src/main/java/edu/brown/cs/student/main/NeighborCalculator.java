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
    Star[] starsArray = (Star[]) (_stars.values().toArray());
    // todo: add Collections.sort(starsArray, new DistanceComparator());
    // count = 0
    // while (count < k) {
    // System.out.println(starsArray[count].getName());
    ArrayList<Star> nearest = new ArrayList<>();
    return nearest;
  }

  public ArrayList<Star> nearest(int k, double x, double y, double z) {
    ArrayList<Star> nearest = new ArrayList<>();
    return nearest;
  }
}
