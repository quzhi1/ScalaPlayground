package com.quzhi1.scalaplayground

import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator3.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator0.cube") {
    assert(CubeCalculator.cube(0) === 0)
  }
}

