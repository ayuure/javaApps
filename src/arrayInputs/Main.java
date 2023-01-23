package arrayInputs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int totalNumber = 0;
        int counter = 0;
        double mean;
        int highestCount = 0;
        try {
            while (input.hasNext()) {
                int numbers = input.nextInt();
                totalNumber += numbers;
                counter++;
                list.add(numbers);
            }

        } catch (InputMismatchException ex) {
            System.out.println(list);
            //for mean
            mean = totalNumber / counter;
            System.out.println("The mean is " + mean);
            //median
            int size = list.size();
            int i = size / 2;
            //odd
            list.sort(Comparator.naturalOrder());
            if (counter % 2 == 1) {
                System.out.println("the median is : " + list.get(i));
            }
            //even
            else {
                double median= (list.get(i - 1) +list.get(i))/2;
                System.out.println("The median is: "+median) ;
            }
            System.out.println("The maximum number is : "+Collections.max(list));
            System.out.println("The minimum number is : "+Collections.min(list));
        }
        int mode = 0;
        for (int i = 0; i <=list.size()-1; i++) {
            if(i==0){
                mode=list.get(i);
            }
            int appearCount =1;

            for(int j=1; j<=list.size()-1; j++) {

                if(i+1==j){
                    continue;
                }
                if (list.get(i)==list.get(j)) {
                    appearCount++;
                    if(highestCount<appearCount){
                        highestCount = appearCount;
                        mode=list.get(i);
                    }
                }




            }


        }
        System.out.println("the mode is : "+mode);

    }
}
