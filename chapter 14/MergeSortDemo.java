import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random strings.
*/
public class MergeSortDemo
{  
   public static void main(String[] args)
   {  
      String[] a = {"asdf","HDFHU","vurfn","DF df","zzzzz","aaaaa","gfg","DSJIGBfoafhbv",
                             "asdf","ASDF"};
      System.out.println(Arrays.toString(a));

      MergeSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}

