public abstract class Objects {
    public double price;
    public String name;
    public int id;

    public Objects() {
    }

    public abstract double getPrice();

    public abstract String getName();

    public abstract int getId();

    public abstract void setName();

    public abstract void setPrice();
}