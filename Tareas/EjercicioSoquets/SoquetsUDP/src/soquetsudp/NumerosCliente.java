package soquetsudp;

import java.util.Scanner;

public class NumerosCliente {
  private String operation;
  private int num1;
  private int num2;
  private int num3;

  public NumerosCliente(String operation, int num1, int num2, int num3) {
    this.operation = operation;
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
  }

  @Override
  public String toString() {
    return operation + "-" + num1 + "-" + num2 + "-" + num3;
  }

  public String getOperation() {
    return operation;
  }

  public int getNum1() {
    return num1;
  }

  public int getNum2() {
    return num2;
  }

  public int getNum3() {
    return num3;
  }
}
