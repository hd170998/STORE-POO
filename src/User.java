public class User {

    final protected int ID;
    final protected String NAME;
    final protected char GENERO;
    protected String password = "";
    protected int edad = 0;

    public User(int ID, String NAME, char GENERO) {
        this.ID = ID;
        this.NAME = NAME;
        this.GENERO = GENERO;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean verifyLogin(String password){
        boolean verify = false;
        return verify;
    }

}
