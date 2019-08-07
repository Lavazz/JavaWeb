package by.trjava.task02.entity;


public class Album extends Edition {
    String designer;

    private static final double DECREASING_COEFFICIENT_ALBUM=0.3;
    public Album(int id, String title, int numberOfPages, int releaseYear, double initialPrice, String designer, String genre) {
        super(id, title, numberOfPages, releaseYear, initialPrice, genre);
        this.designer = designer;
            }

       public String getAuthor() {
        return designer;
    }

    public void setAuthor(String designer) {
        this.designer = designer;
    }
    @Override
    public double calculateCurrentPrice(double initialPrice, int releaseYear) {
        return initialPrice-(CURRENT_YEAR-releaseYear)*DECREASING_COEFFICIENT_ALBUM*initialPrice;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) return false;
        Album other = (Album) obj;
        if (designer == null) {
            if (other.designer != null) {
                return false;
            } else if (!designer.equals(other.designer)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (super.hashCode() + (designer == null ? 0 : designer.hashCode()));
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", designer='" + designer + '\'';
    }
}
