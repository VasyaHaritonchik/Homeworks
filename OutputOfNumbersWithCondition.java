public class OutputOfNumbersWithCondition {
  public static void main(String[] args) {
    for(int integerForTheCycle = 0; integerForTheCycle <= 100; integerForTheCycle++) {
      if(integerForTheCycle % 3 == 0) {
        System.out.println("3*" + integerForTheCycle / 3);
      } else {
          System.out.println(integerForTheCycle);
      }
     }
  }
}