import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cards Hello = new Cards();

        System.out.println("Hello player. Ready to play?");
        Scanner yn = new Scanner(System.in);
        String yesOrNo;

        yesOrNo = yn.nextLine();
        String yes = yesOrNo;
//            System.out.println(yes);
        int playAgain = 1;
        while(playAgain == 1){
            playAgain = 0;
            if (yes == yesOrNo) {
                try {

                    System.out.println("Great.");
                    Thread.sleep(1500);
                    System.out.println("Dealing Cards...");
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Something went wrong. Try again");
                }
            }

            int sum_of_cards = 0;
            for (int i = 1; i < 3; i++) {
                int card = Cards.getCard();

                try {
                    Thread.sleep(500);
                    Cards.printnumCards(card);
                } catch (Exception x) {
                    System.out.println("Error");
                }

                sum_of_cards += card;

            }

            System.out.println("Nice hand, your cards add up to " + sum_of_cards);

            String answer = "";

            while (sum_of_cards <= 21) {
                System.out.println("Would you like to hit or stand?");
                Scanner hit_stand = new Scanner(System.in);

                answer = hit_stand.nextLine();


                String answer_final = answer;
                //            System.out.println(answer_final);

                if (answer_final.equals("Hit") || answer_final.equals("hit")) {
                    int hit_card = Cards.getCard();
                    Cards.printnumCards(hit_card);
                    sum_of_cards += hit_card;

                } else if (answer_final.equals("Stand") || answer_final.equals("stand")) {
                    break;
                }

                System.out.println("Your cards add up to " + sum_of_cards);

            }
//             If the player busts, then tests to see if they want to play again
            if (sum_of_cards > 21) {
                System.out.println("You lose");
                System.out.println("Do you want to play again?");
                Scanner playAgain2 = new Scanner(System.in);
                String awnserPlayAgain1;

                awnserPlayAgain1 = playAgain2.nextLine();

                if(awnserPlayAgain1.equals("yes")){
                    playAgain = 1;

                }else{
                    playAgain = 0;
                    System.exit(0);
                }
            }else {


                System.out.println("Dealing dealers cards...");

                int dealerCards = 0;
                for (int i = 1; i < 3; i++) {
                    int card = Cards.getCard();

                    try {
                        Thread.sleep(500);
                        Cards.printnumCards(card);
                    } catch (Exception x) {
                        System.out.println("Error");
                    }

                    dealerCards += card;

                }
                System.out.println("Dealers cards add up to " + dealerCards);
                while (dealerCards <= 16) {


                    //            System.out.println(answer_final);


                    int hit_card = Cards.getCard();
                    try {
                        Thread.sleep(1000);
                        Cards.printnumCards(hit_card);
                    } catch (Exception e) {
                        System.out.println("Error");
                    }

                    dealerCards += hit_card;


                    System.out.println("Dealers cards add up to " + dealerCards);

                }

                if (dealerCards > sum_of_cards && dealerCards <= 21) {
                    System.out.println("You lose");
                } else if (dealerCards == sum_of_cards) {
                    System.out.println("Its a tie!");
                } else {
                    System.out.println("You Win!");
                }

                System.out.println("Do you want to play again?");
                Scanner playAgain1 = new Scanner(System.in);
                String awnserPlayAgain;

                awnserPlayAgain = playAgain1.nextLine();

                if (awnserPlayAgain.equals("yes")) {
                    playAgain = 1;
                } else {
                    playAgain = 0;
                }
            }

        }


    }

}