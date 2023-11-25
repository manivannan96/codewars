public class Calculate_AverageArray_8kyu {
    
    public class Kata{
        public static double find_average(int[] array){
          
          double s = 0;
          double avg = 0;
           for(int i=0; i<array.length; i++)
             {
             
             s += array[i];
           }
           avg = s/array.length;
         
        return avg;
          }
      }
}
