package BlackJack;


import BlackJack.Userclass;
import BlackJack.Dealerclass;

//package BlackJack;
//import BlackJack.Dealerclass;
//import BlackJack.Userclass;


public class BlackJack {
    
    public static void main(String[] args) {
      
       Dealerclass dealer = new Dealerclass();
       Userclass user = new Userclass();
       
       //手札に加える
dealer.setCards(dealer.deal());
       user.setCards(dealer.deal());
       
       //手札の確認
       dealer.checkSum();
       while(dealer.checkSum() == true){
           dealer.setCards(dealer.hit());
           dealer.checkSum();
       }
       
       user.checkSum();
       while(user.checkSum() == true){
           user.setCards(dealer.hit());
           user.checkSum();
       }
       
       //合計値を出す
       int sumDealer = dealer.open();
       int sumUser = user.open();
       
       //勝敗判定
       if(sumDealer > 21 && sumUser > 21){
           
          System.out.print("あなたのカードの合計は"+sumUser+",burstです<br>"
                           +"ディーラーのカードの合計は"+sumDealer+",burstです<br>"
                           +"引き分けです");
          
       }else if(sumDealer > 21 && sumUser < 21){
           
           System.out.print("あなたのカードの合計は"+sumUser+",<br>"
                           +"ディーラーのカードの合計は"+sumDealer+",burstです<br>"
                           +"あなたの勝ちです!");
       
    }else if(sumDealer < 21 && sumUser > 21){
           
           System.out.print("あなたのカードの合計は"+sumUser+",<br>"
                           +"ディーラーのカードの合計は"+sumDealer+",burstです<br>"
                           +"あなたの負けです!");
       
    }else if(sumDealer == sumUser){
        
        System.out.print("あなたのカードの合計は"+sumUser+",<br>"
                           +"ディーラーのカードの合計は"+sumDealer+",<br>"
                           +"引き分けです");
        
    }else if(sumDealer > sumUser){
        
        System.out.print("あなたのカードの合計は"+sumUser+",<br>"
                           +"ディーラーのカードの合計は"+sumDealer+",<br>"
                           +"あなたの負けです");
    
    }else{
        
        System.out.print("あなたのカードの合計は"+sumUser+",<br>"
                           +"ディーラーのカードの合計は"+sumDealer+",<br>"
                           +"あなたの勝ちです");
    
    }
  }    
}
