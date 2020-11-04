import java.util.Scanner;

public class Temperature {
    
    public static void main(String[] args) {
        
        float celcius;
        double farenheit;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of celcius =");
        celcius = input.nextFloat();

        farenheit = (1.8*celcius) + 32;

        System.out.print("Temperature of farenheit is "+farenheit);
    }
}
