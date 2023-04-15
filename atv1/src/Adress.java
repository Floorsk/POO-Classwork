public class Adress {

    private int cep;
    private String log;
    private int number;

    public Adress() {
    }

    public Adress(int cep, String log, int number) {
        this.cep = cep;
        this.log = log;
        this.number = number;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
