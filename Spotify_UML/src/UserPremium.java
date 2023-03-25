public class UserPremium extends User {
    
    int card;

    UserPremium(String name, String lastName, String username, String email, int card) {

        super(name, lastName, username, email);
        this.card = card;
        
    }

}
