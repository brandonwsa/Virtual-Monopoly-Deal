package Objects;

/*deck.java*/

import java.util.Stack;
public class Deck {
    
    private Stack<Card> cardsInDeck;
    private int amountOfCards;
    
    public Deck(){
    cardsInDeck = new Stack<Card>();
    
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
}
