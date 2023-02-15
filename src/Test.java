import java.util.Random;

public class Test {

    public static void main(String[] args){
        int number = 0;
        Random rand_card = new Random();
        int upper = 12;

        for(int i = 0; i < 100; i++){
            number = rand_card.nextInt(upper);
            System.out.println(number);

        }



    }

}
