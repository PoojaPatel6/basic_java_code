public class Main{
    public static void main(String[] args) {
      int width = 0;    //20
      int length = 40;
      int ratio = length/width;     //devide/zero arithmetic exception
      System.out.println(ratio);
    }
  }




//  ArrayIndexOutOfBoundsException

//   public class Main {
//     public static void main(String[] args) {
//       int[] numbers = {1, 2, 3, 4, 5};
          
//       int lastNumber = numbers[5];
          
//       System.out.println("The value of the last element is: " + lastNumber);
//     }
//   }




//Modify it

// public class Main {
//     public static void main(String[] args) {
//       int[] numbers = {1, 2, 3, 4, 5};
          
//       int lastNumber = numbers[4];
          
//       System.out.println("The value of the last element is: " + lastNumber);
//     }
//   }





// Exception Handling by try and catch

// public class Main{
//     public static void main(String[] args) {
//      int width = 0;
//      int length = 40;
//         try {
//        int ratio = length / width;
//      } catch (ArithmeticException e) {
//        System.err.println("ArithmeticException: " + e.getMessage());
//      }
//    }
//   }