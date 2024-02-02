import java.util.Scanner

public class FrequencyCounter 
{
    public static void main(String[] args)
 {
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        
        int[] frequencies = new int[10]; 
        for (int num : array)
 {
            frequencies[num]++;
        }

        
        System.out.println("Element | Frequency");
        System.out.println("--------------------------");
        for (int i = 0; i < frequencies.length; i++)
 {
            if (frequencies[i] != 0) 

                System.out.println(i + " | " + frequencies[i]);
            }
        }
    }
