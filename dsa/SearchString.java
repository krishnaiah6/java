package dsa;

public class SearchString {
   public static void main(String[] args) {
      String name = "krishna";
      char target = 'k';
    //   boolean ans=Search(name, target);
    //   System.out.println(ans);
      boolean ans1=Search2(name, target);
      System.out.println(ans1);
   }

//    static boolean Search(String str, char target) {
//       if (str.length() == 0) {
//          return false;
//       } else {
//          for(char ch : str.toCharArray()) {
//             if (ch == target) {
//                return true;
//             }
//          }

//          return false;
//       }
//    }
   static boolean Search2(String str, char target) {
      if (str.length() == 0) {
         return false;
      } 
         for(int i=0;i<str.length();i++) {
            if (target==str.charAt(i)) {
               return true;
            }
         }

         return false;
      }
   }
