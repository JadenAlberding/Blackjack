import java.util.Random;

public class Cards {

    public static int getCard(){
        int card_number = 0;

        Random rand_card = new Random();
        int upper = 11;
        card_number = rand_card.nextInt(upper);
//        Because there is no card 0, test if it is and return a value that is not zero
        if(card_number == 0){
            while(card_number == 0){
                card_number = rand_card.nextInt(upper);
            }
        }
//        System.out.println(card_number);

        return card_number;
    }

    public static void printnumCards(int n){
//        Impliment get card later



        if(n == 1 ){
            System.out.print( "╭----------------╮\n" +
                              "| A              |\n" +
                              "|                |\n" +
                              "|                |\n" +
                              "|      /-\\       |\n" +
                              "|     /   \\      |\n" +
                              "|    /-----\\     |\n"+
                              "|   /       \\    |\n" +
                              "|                |\n"+
                              "|              A |\n" +
                              "╰----------------╯\n"

            );

        }else if( n == 2){
            System.out.print( "╭----------------╮\n" +
                              "| 2              |\n" +
                              "|                |\n" +
                              "|     ╭----╮     |\n" +
                              "|          |     |\n" +
                              "|         /      |\n" +
                              "|       /        |\n"+
                              "|     /_____     |\n" +
                              "|                |\n"+
                              "|              2 |\n" +
                              "╰----------------╯\n"

            );
        }else if(n == 3){
            System.out.print( "╭----------------╮\n" +
                              "| 3              |\n" +
                              "|                |\n" +
                              "|     ╭----╮     |\n" +
                              "|          |     |\n" +
                              "|       ---|     |\n" +
                              "|          |     |\n"+
                              "|     ╰----╯     |\n" +
                              "|                |\n"+
                              "|              3 |\n" +
                              "╰----------------╯\n"

            );

        } else if(n == 4){
            System.out.print( "╭----------------╮\n" +
                              "| 4              |\n" +
                              "|                |\n" +
                              "|    |     |     |\n" +
                              "|    |     |     |\n" +
                              "|    ╰-----┧     |\n" +
                              "|          |     |\n"+
                              "|          |     |\n" +
                              "|                |\n"+
                              "|              4 |\n" +
                              "╰----------------╯\n"

            );
        }else if(n == 5){
            System.out.print( "╭----------------╮\n" +
                              "| 5              |\n" +
                              "|                |\n" +
                              "|    ╭-----╮     |\n" +
                              "|    |           |\n" +
                              "|    ╰-----╮     |\n" +
                              "|          |     |\n"+
                              "|    ------╯     |\n" +
                              "|                |\n"+
                              "|              5 |\n" +
                              "╰----------------╯\n"

            );
        }else if(n == 6){
            System.out.print( "╭----------------╮\n" +
                              "| 6              |\n" +
                              "|                |\n" +
                              "|    ╭-----╮     |\n" +
                              "|    |           |\n" +
                              "|    ├-----╮     |\n" +
                              "|    |     |     |\n"+
                              "|    ╰-----╯     |\n" +
                              "|                |\n"+
                              "|              6 |\n" +
                              "╰----------------╯\n"

            );

        }else if(n == 7){
            System.out.print( "╭----------------╮\n" +
                              "| 7              |\n" +
                              "|                |\n" +
                              "|     ╭-----╮    |\n" +
                              "|          /     |\n" +
                              "|         /      |\n" +
                              "|        /       |\n"+
                              "|       /        |\n" +
                              "|                |\n"+
                              "|              7 |\n" +
                              "╰----------------╯\n"

            );

        }else if(n == 8){
            System.out.print( "╭----------------╮\n" +
                            "| 8              |\n" +
                            "|                |\n" +
                            "|    ╭-----╮     |\n" +
                            "|    |     |     |\n" +
                            "|    ├-----┤     |\n" +
                            "|    |     |     |\n"+
                            "|    ╰-----╯     |\n" +
                            "|                |\n"+
                            "|              8 |\n" +
                            "╰----------------╯\n"

            );

        }else if(n == 9){
            System.out.print( "╭----------------╮\n" +
                    "| 9              |\n" +
                    "|                |\n" +
                    "|    ╭-----╮     |\n" +
                    "|    |     |     |\n" +
                    "|    ╰-----┤     |\n" +
                    "|          |     |\n"+
                    "|    ╰-----╯     |\n" +
                    "|                |\n"+
                    "|              9 |\n" +
                    "╰----------------╯\n"

            );

        }else if(n == 10){
            System.out.print( "╭----------------╮\n" +
                              "| 10             |\n" +
                              "|                |\n" +
                              "|    ╷  ╭----╮   |\n" +
                              "|    |  |    |   |\n" +
                              "|    |  |    |   |\n" +
                              "|    |  |    |   |\n"+
                              "|    ╵  ╰----╯   |\n" +
                              "|                |\n"+
                              "|             10 |\n" +
                              "╰----------------╯\n"

            );

        }else if(n == 11){
            System.out.print( "╭----------------╮\n" +
                    "| A              |\n" +
                    "|                |\n" +
                    "|                |\n" +
                    "|      /-\\       |\n" +
                    "|     /   \\      |\n" +
                    "|    /-----\\     |\n"+
                    "|   /       \\    |\n" +
                    "|                |\n"+
                    "|              A |\n" +
                    "╰----------------╯\n"

            );
        }
    }

}
