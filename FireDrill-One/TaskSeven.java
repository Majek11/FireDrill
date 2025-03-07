public class TaskSeven{
      public static void main(String...args){
        int sum = 0;
        int count = 0;
          for( int counts  = 1; counts <= 10; counts++){
         if(count % 4 ==0){
          for(int number =1; number <= 5; number++){
           counts = counts * 4;
     
    

      System.out.println(counts);
  
           sum = sum + counts;
 
 }
  
   }
 }
      System.out.println("sum is " + sum);

      int sum2 = 0;
     int count1 = 0;
     for( int count2  = 1; count2 <= 10; count2++){
    if(count1 % 8 ==0){
    for(int number =1; number <= 5; number++){
     count2 = count2 * 8;

     sum2 = sum2 + count2;
  System.out.println(count2);
  
      }
    }
  }
System.out.println("sum is " + sum2);
 }
}




