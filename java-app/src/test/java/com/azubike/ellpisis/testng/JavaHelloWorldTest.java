package com.azubike.ellpisis.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JavaHelloWorldTest {

  @Test
  public void testGetHelloWorld() {
    final JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
    assertEquals("Hello World", javaHelloWorld.getHelloWorld());
  }
}
