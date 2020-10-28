package Objects;
import java.util.List;
import java.util.ArrayList;


public class Player{
    
    protected String name;
 //   protected int ID; //dont think we need
    protected int completedProperties;
    protected int totalMoney;
    protected Card lastCardPlayed;
    protected Card cardToPlay;
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
        totalMoney = 0;
        hand = new ArrayList<Card>();
        money = new ArrayList<Card>();
        properties = new ArrayList<Card>();
        
        //make hand and fill it with null values as place holders.
        //When adding cards to the hand, null will be replaced with the card.
        for (int i=0; i<12; i++){
            hand.add(null);
        }
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
    
    public int getTotalMoney(){
        return totalMoney;
    }
    
    public Card getCardToPlay(){
        return cardToPlay;
    }
    
    public void setLastCardPlayed(Card c){
        lastCardPlayed = c;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setCardToPlay(Card c/*int handSlotNum*/){
      //  cardToPlay = hand.get(handSlotNum-1); //minus 1 for correct index in player's list hand.
      cardToPlay = c;
    }
    
    /**
     * Adds a card to the players hand. Will find the first open spot in player hand that is null and replace it with a proper card.
     * @param card 
     */
    public void addToHand(Card card){
        int i = 0;
        
        //iterates through player hand finding first null spot to put card. Returns out once found.
        for (Card c : hand){ 
            if (c == null){
                hand.set(i, card);
                return;
            }
            i++;
        }
    }
    
    protected void addMoney(Card card){
        money.add(card);
        totalMoney += card.getValue();
    }
    
    protected void addProperty(Card card){
        properties.add(card);
    }
    
    public void addCompletedProperty(){
        completedProperties++;
    }
    
    /**
     * takes card and removes it from player's hand list by setting it to null.
     * @param card 
     */
    protected void removeCardFromHand(Card card){
        int i = 0;
        
        //iterate through hand to find matching card to remove. Returns out once found.
        for (Card c : hand){ 
            if (c == card){
                hand.set(i, null); //set card to null
                return;
            }
            i++;
        }
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
    
    
    /**
     * Plays a property card by adding it to player's properties and removing it from player's hand
     * @param propertySlot 
     */
    public void playPropertyCard(int[] propertySlot){
        Card c = getCardToPlay();
        
        System.out.println(c.getName()); //for testing
        
        System.out.println("Property added to slot: "+propertySlot[0]+" "+propertySlot[1]); //for testing
        
        //add card to player's properties
        addProperty(c);
        
        //remove card from player's hand.
        removeCardFromHand(c);
    }
    
    
    public void playMoneyCard(){
        Card c = getCardToPlay();
        
        System.out.println(c.getName()); //for testing
        System.out.println("Added money"); //for tetsing

        //adds card to player's list of money. Also adds the value of the card to player's total money
        addMoney(c);
        
        //remove card from player's hand.
        removeCardFromHand(c);
    }
    
    public void printHand(){
        for (int i=0; i<hand.size(); i++){
            System.out.println(hand.get(i).getName());
        }
            
    }
    
}