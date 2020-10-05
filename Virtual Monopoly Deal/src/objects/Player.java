package Objects;
import java.util.List;


public class Player{
    
    protected String name;
 //   protected int ID; //dont think we need
    protected int completedProperties;
    protected Card lastCardPlayed;
    protected List<Card> hand; //wont do anything until first card is added to hand.
    protected List<Card> money; //wont do anything until first money is added. //if this list is null, money = 0 in game.
    protected List<Card>/*<PropertySlot>*/ properties; //wont do anything until first property is added.
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
        //will need to communicate with playScreen.java and grab name inputed.
        //name = playScreen.getPlayerName();
        completedProperties = 0;
        lastCardPlayed = new Card();
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
     */
    public void drawCard(){
        //draws card from deck
    }
    
    /**
     * Discards the card the player wants to.
     */
    public void discardCard(){
        //discards the card the player wants to.
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
    
}