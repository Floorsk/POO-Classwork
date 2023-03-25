public class User {

    String name;
    String lastName;
    String username;
    String email;

    User(String name, String lastName, String username, String email) {

        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.email = email;

    }

    void listening() {
        System.out.println("O usuário " + username + " está ouvindo ao Spotify.");
    }
    
}