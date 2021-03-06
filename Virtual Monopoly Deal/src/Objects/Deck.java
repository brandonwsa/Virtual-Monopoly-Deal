package Objects;

/*deck.java*/

import java.util.Collections;
import java.util.Stack;

public class Deck {
    
    public static Exception LAST_EXCEPTION; //captures last exception in class. Used for testing.
    private Stack<Card> cardsInDeck;
    private int amountOfCards;
    
    public Deck(){
        cardsInDeck = new Stack<Card>();

    }
    
    /**
     * Fills deck with cards.
     */
    public void fillDeck(){
        
        try{
            Card card;
            //fill deck with cards. 108 total cards in the deck
            for (int i=0; i<108; i++){
                card = new Card(i);
                addCard(card);
            }
        }
        catch(Exception e){
            System.out.println("Error when filling deck in fillDeck() in Deck.java. e: "+e);
            LAST_EXCEPTION = e; //capture exception to use for testing.
        }
        
    }
    
    public int addCard(Card card){
        try{
            cardsInDeck.push(card);
        }
        catch(Exception e){
            return 1;//returns 1 if error id caught 
        }
        return 0;
        
        
    }
    
    public Card getTopCard(){
        return cardsInDeck.pop();
    
    }
    
    public int shuffle(){
        try{
            Collections.shuffle(cardsInDeck);
        }catch(Exception e){
            System.out.println("Error shuffling deck. Exception: "+e);
            return 1;//if error occurs
        }
        return 0;
    }
    
    /**
     * Prints the cards in the deck, the name and their type.
     */
    public void printCards(){
        try{
            for (int i=0; i<cardsInDeck.size(); i++){
                System.out.println(cardsInDeck.get(i).getName()+"\t type: "+cardsInDeck.get(i).getType());  
            }  
        }
        catch(Exception e){
            System.out.println("Error when printing cards in printCards() in Deck.java. e: "+e);
            LAST_EXCEPTION = e; //capture exception to use for testing.
        }
        
    }
}
