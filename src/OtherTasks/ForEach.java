package OtherTasks;

public class ForEach {
  public static void main(String[] arg)
  {
    {
      int[] marks = { 125, 132, 95, 116, 110 };

      int highest_marks = maximum(marks);


    }
  }
  public static int maximum(int[] numbers)
  {
    int[] marks = { 125, 132, 95, 116, 210 };
    int maxSoFar = marks[0];

    // for each loop
    for (int num : marks)
    {
      if (num > maxSoFar)
      {
        maxSoFar = num;

      }
    }return maxSoFar;



  }

}
