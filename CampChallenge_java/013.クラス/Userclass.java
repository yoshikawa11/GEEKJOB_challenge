package BlackJack;


import java.util.ArrayList;
import java.util.Random;


public class Userclass extends Humanclass{
        
        //public void setCardsDemo(Integer someCard){
            //myCards.add(someCard);
        //ArrayList<Integer> myCards = new ArrayList<Integer>(); 原因   
        public void setCards(ArrayList<Integer> n){
            
            for(int i = 0; i < n.size();i++){
           
                myCards.add(n.get(i));
          
        }
        }

        public boolean checkSum() {

            int tashizan = open();
            if (tashizan > 21) {
                return false;
            } else {
                return true;
            }

        }

        public int open() {

            int sum = 0;
            for (int trump : myCards) {
                if (trump == 11) {
                    trump = 10;
                    sum += trump;
                } else if (trump == 12) {
                    trump = 10;
                    sum += trump;
                } else if (trump == 13) {
                    trump = 10;
                    sum += trump;
                } else {
                    sum += trump;
                }  
            }return sum;
        }
    }
    


    

