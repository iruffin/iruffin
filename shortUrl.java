/*
 *Author@ Iverson Ruffin
 *The shortUrl class shortens the size of a url into a random 6 letter alphanumeric string, and can restore the shortened URL to its original (unless there is no such URL, then it will return null)
 *
 */
import java.util.Random;

public class shortUrl {
   ////Declaring all variables////
   
   public String url;
   public String shortUrl;
   public String lowerCase = "abcdefghiklmnopqrstuvwxyz";
   public String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   public String numbers = "0123456789";
   public String alphaNum = numbers + upperCase + lowerCase;
   
   public char[] alphaNumArray = alphaNum.toCharArray();
   public char[] array = new char[6];
   
   ////Constructors////
   
   Random r = new Random();
   
   //Getters
   public String getUrl () {
      return url;
   } 
   
   public String getShortUrl () {
      return shortUrl;
   }  
   
   ////Setters////
   
   public void setUrl (String url) {
      this.url = url;
   }
   
   public void setShortUrl (String shortUrl) {
      this.shortUrl = shortUrl;
   }
   
   /////METHODS/////
   
   //Generates a random 6 character alphanumeric char array
   //returns char array
   public char[] generateSymbol () {
      for(int i = 0; i < 6; i++) {
         array[i] = alphaNumArray[r.nextInt(alphaNumArray.length)];   
      }
   return array;
   }
   
   //returns a shortened URL
   public String shorten (String url) {
      shortUrl = String.valueOf(generateSymbol());
   return shortUrl;
   }
   
   //restores the shortened URL to its original URL, and returns
   //null if there is no such original URL
   public String restore (String shortUrl) {
      if (getShortUrl() != shortUrl) {
         return null;
      }
   return url;
   }
   
   public static void main(String[] args) {         
   }
   
      
      
        
   
   
   
}