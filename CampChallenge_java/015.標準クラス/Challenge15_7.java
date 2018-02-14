
package import_date;


public class Challenge15_7 {
    
    public static void main(String[] args){
        
        String words = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String word1 = words.replace("U","う");
        String word2 = word1.replace("I","い");
        System.out.print(word2);
        
    }
    
}
