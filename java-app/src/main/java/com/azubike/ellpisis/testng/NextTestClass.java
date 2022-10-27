package com.azubike.ellpisis.testng;

import java.util.Arrays;

public class NextTestClass {
  int sumOfNumbers(int... args) {
    return Arrays.stream(args).reduce(0, Integer::sum);
  }
}
