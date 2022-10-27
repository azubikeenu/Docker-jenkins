package com.azubike.ellpisis.junit4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextTestClassTest {

  @Test
  public void sumOfNumbers() {
    final NextTestClass nextTestClass = new NextTestClass();
    assertEquals(6, nextTestClass.sumOfNumbers(1, 2, 3));
  }
}
