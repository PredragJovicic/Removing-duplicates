package remotejob;

import java.util.*;

public class task1 {

    private static List<Double> removeduplicates(List<Double> list){

        List<Double> mylist = list;
        double var = 0.0,varj;

        for(int i=0; i<list.size();i++){
            var = list.get(i);
            for(int j=0; j<list.size();j++){
                varj = list.get(j);
                if(i != j) {
                    if (var == varj) {
                        mylist.remove(j);
                    }
                }
            }
        }

        return mylist;
    }



    public static void main(String[] args) {

        List<Double> list = new ArrayList<Double>();

        for(;;) {
            try {

                System.out.println("Enter number ");
                Scanner input = new Scanner(System.in);
                double value = input.nextDouble();
                list.add(value);

                List<String> valuefordisplay = new ArrayList<String>();

                for ( double val :removeduplicates(list) ) {

                    if ((val == Math.floor(val)) && !Double.isInfinite(val)) {
                        valuefordisplay.add(""+(int)val);
                    }else{
                        valuefordisplay.add(""+val);
                    }

                }

                System.out.println("Array "+valuefordisplay);


            } catch (Exception e) {

                System.out.println("Input is not number or end of input!");
                break;
            }
        }


    }
}
