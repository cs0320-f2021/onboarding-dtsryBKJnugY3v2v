package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
  }

  @Test
  public void testLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18, 17);
    assertEquals(1, output, 0.01);
  }

  @Test
  public void testLargerSubtraction() {
    MathBot mb = new MathBot();
    double output = mb.subtract(21423634, 231245);
    assertEquals(21192389, output, 0.01);
  }

  @Test
  public void testZeros() {
    MathBot mb = new MathBot();
    double output = mb.add(0, 2);
    assertEquals(2, output, 0.01);
    double output2 = mb.subtract(4, 0);
    assertEquals(4, output, 0.01);
    double output3 = mb.add(0,0);
    assertEquals(0,output3, 0.01);
  }

  @Test
  public void testNegatives() {
    MathBot mb = new MathBot();
    double output = mb.subtract(3,6);
    assertEquals(-3, output, 0.01);
  }

  @Test
  public void testSmallerNumbers() {
    MathBot mb = new MathBot();
    double output = mb.add(0.1, 0.1);
    assertEquals(0.2, output, 0.001);
  }

  // TODO: add more unit tests of your own
}
