package Objects;
import java.util.List;
import java.util.ArrayList;


public class Player{
    
    protected String name;
 //   protected int ID; //dont think we need
    protected int completedProperties;
    protected Card lastCardPlayed;
    protected List<Card> hand; //wont do anything until first card is added to hand.
    protected List<Card> money; //wont do anything until first money is added. //if this list is null, money = 0 in game.
    protected List<Card>/*<PropertySlot>*/ properties; //wont do anything until first property is added.
    protected List<Card> discardDeck;//where the cards will be discarded..... do we need this? 
    //might be good to have an totalMoney, will add up all the money the player has. Property slot may be a 2d array
    
    /**
     * Initiates object.
     */
    public Player(){
        init();
        
    }
    
    /**
     * creates object
     */
    protected void init(){
        completedProperties = 0;
        hand = new ArrayList<Card>();
   //     lastCardPlayed = new Card(); //commented out to prevent class from having an error.
    }
    
    public List getHand(){
        return hand;
    }
    
    public Card getLastCardPlayed(){
        return lastCardPlayed;
    }
    
    public List getMoney(){
        return money;
    }
    
    public List getProperties(){
        return properties;
    }
    
    public int getCompletedProperties(){
        return completedProperties;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void addToHand(Card card){
        hand.add(card);
    }
    
    public void addMoney(Card card){
        money.add(card);
    }
    
    public void addProperty(Card card){
        properties.add(card);
    }
    
    public void addCompletedProperty(){
        completedProperties++;
    }
    
    /**
     * takes card and removes it from player's hand list.
     * @param card 
     */
    private void removeCardFromHand(Card card){
        hand.remove(card);
    }
    
    /**
     * Draws card from deck.
     * @param d
     */
    public void drawCard(Deck d){
        hand.add(d.getTopCard());
    }
    
    /**
     * Discards the card the player wants to.
     * @param card
     * @param discard
     */
    public void discardCard(Card card, Deck discard){
        //discards the card the player wants to.
        discard.addCard(card);
    }
    
    /**
     * Plays passed in card.
     * @param card 
     */
    public void playCard(Card card){
        //if card == rentCard
        //  action.playRentCard(card);
    }
    //... add more of these action calls that will call action.
    
    public void printHand(){
        for (int i=0; i<hand.size(); i++){
            System.out.println(hand.get(i).getName());
        }
            
    }
    
}