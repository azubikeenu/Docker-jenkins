package com.azubike.ellpisis.junit4;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

  @Test
  public void getHelloWorld() {
    JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
    assertEquals("Hello World", javaHelloWorld.getHelloWorld());
  }
}
