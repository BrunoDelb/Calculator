package com.leszko.calculator;

import org.springframework.stereotype.Service;

/**
 * Calculator Spring Application.
 */
@Service
public class Calculator {
     int sum(int a, int b) {
          return a + b;
     }
}
