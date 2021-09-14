import java.util.Arrays;

public class BubbleSort<T>
{
 T[] array;
public static<T extends Comparable> void sort(T[] array)
 {
    for(int i = array.length; i > 1; i--)
      {
      for(int j = 0; j < i - 1; j++)
        {
       
        if(array[j].compareTo(array[j+1]) > 0)
          
         {
          T temp = array[j];
          array[j] = array[j+1];
         array[j+1] = temp; 
        }
      }            
    }
    System.out.println("Sorted array- " + Arrays.toString(array)); 
    
  }
public static void main(String[] args)
	
{
Integer[] arr = {24,81,2,73,52,48};
   BubbleSort<Integer> obj = new BubbleSort<Integer>();
   obj.sort(arr);

String[] arr2 = {"Ram","Ashik","Laxmi","Manu","Richard","Neha"};
BubbleSort<String> obj2 = new BubbleSort<String>();
obj2.sort(arr2);   

Float[] arr3={20.1f,8.3f,90.8f,6.4f,21.8f};
BubbleSort<Float> obj3=new BubbleSort<Float>();
obj.sort(arr3);
	 	
}

}