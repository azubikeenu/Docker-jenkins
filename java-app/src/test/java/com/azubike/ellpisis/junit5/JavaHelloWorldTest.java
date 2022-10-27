package com.azubike.ellpisis.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

  @Test
  void getHelloWorld() {
    JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
    assertEquals("Hello World" , javaHelloWorld.getHelloWorld());
  }
}