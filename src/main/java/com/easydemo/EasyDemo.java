package com.easydemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EasyDemo {

   private static final Logger logger = LogManager.getLogger(EasyDemo.class);

   public static void main(String[] args) {
      logger.info("Hello World");
      logger.info("Here we go");

      int num1 = 4;
      int num2 = 2;
      logger.debug("------------------------------");
      logger.debug("Number 1: {}", num1);
      logger.debug("Number 2: {}", num2);
      int num3 = -1;

      num3 = divideTwoNumbers(num1, num2);
      logger.info("Number 3: {}", num3);

      logger.debug("------------------------------");
      num1 = 10;
      num2 = 0;
      logger.debug("Number 1: {}", num1);
      logger.debug("Number 2: {}", num2);

      try {
         num3 = divideTwoNumbers(num1, num2);
      }
      catch (ArithmeticException e) {
         logger.warn("Caught ArithmeticException", e);
         logger.info("Sir, you cannot divide by zero, but I caught the exeception.");
      }
   }

   /**
    * Divides two numbers, throws a ArithmeticException when dividing by zero
    * @param num1 The first number
    * @param num2 The second number
    * @return The result of the division
    */

   public static int divideTwoNumbers(int num1, int num2) {
      if (num2 == 0) {
         throw new ArithmeticException("Divide by zero");
      }
      return num1 / num2;
   }

}