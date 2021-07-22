import java.util.*;

public class ThirdTask {

    public void searchValues() {
        Random rand = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        int[] primaryArray = new int[in.nextInt()];
        List<Integer> finalArray = new ArrayList<>();
        in.close();

        for (int i = 0; i < primaryArray.length; i++) {
            primaryArray[i] = rand.nextInt(201) - 100;
            if (primaryArray[i] % 3 == 0) {
                finalArray.add(primaryArray[i]);
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(primaryArray));
        if (finalArray.isEmpty()) {
            System.out.println("Значений кратных 3-м не обнаружено");
        } else {
            System.out.println("Искомые значения: " + finalArray.toString());
        }
    }
}



