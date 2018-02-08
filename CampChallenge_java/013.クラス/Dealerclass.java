package BlackJack;


import java.util.ArrayList;
import java.util.Random;


public class Dealerclass extends Humanclass {
    
    
    
    int num = 0;
    ArrayList<Integer> cards = new ArrayList<Integer>();
    //ArrayList<Integer> myCards = new ArrayList<Integer>();
  
    //山札を作る
    Dealerclass(){
        for (int i = 1; i < 5; i++) {

            for (int j = 0; j < 13; j++) {
                num = j + 1;
                cards.add(num);
    
            }
        }
        
    }
   

    //dealする処理
    public ArrayList<Integer> deal(){

        Random rand = new Random();
        Integer index = rand.nextInt(cards.size());
        
        //ArrayList<Integer> cards1 = new ArrayList<Integer>();

        // remove メソッドの戻り値を格納するための変数・ArrayListを事前に定義しておく
        int atai1 = 0;
        ArrayList<Integer> dealCards = new ArrayList();
        for (int k = 1; k < 3; k++) {
            
            // 定義しておいた変数に remove メソッドの戻り値であるカードを格納する
            atai1 = cards.get(index);
            dealCards.add(atai1);
            cards.remove(index);

        }
        // 変数を戻り値にする
        return dealCards;

    }

    //hitする処理
    public ArrayList<Integer> hit() {

        int atai2 = 0;
        Random rand = new Random();
        ArrayList<Integer> card2 = new ArrayList<Integer>();
        Integer index = rand.nextInt(cards.size());

        //cards.get(index);
        atai2 = cards.get(index);
        card2.add(atai2);
        cards.remove(index);

        return card2;

    }

    //手札に加える
    
    public void setCards(ArrayList<Integer> n){
            
            for(int i = 0; i < n.size();i++){
           
                myCards.add(n.get(i));
                
        }
        }

    
    public boolean checkSum() {

        int tashizan = tashizan();
        if (tashizan > 16) {
            return false;
        } else {
            return true;
        }

    }

    
    public int open() {

        int tashizan = tashizan();
            return tashizan;
    }

   public int tashizan(){
        
        //ArrayList<Integer> myCards = new ArrayList<Integer>();
        int sum = 0;
        for(int trump : myCards){
            if(trump == 11){
            trump = 10;
            sum += trump;}
            else if(trump == 12){
            trump = 10;
            sum += trump;}
            else if(trump == 13){
            trump = 10;
            sum += trump;}
            else{
            sum += trump;}
        }return sum; 
        }
    
}
