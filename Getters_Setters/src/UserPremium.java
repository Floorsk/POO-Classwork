public class UserPremium extends User {
    
    private int card;

    UserPremium(String name, String lastName, String username, String email, int card) {

        super(name, lastName, username, email);
        this.card = card;
        
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

}
