package by.trjava.task02.entity;


public class Album extends Edition {

    private String designer;
    private static final double DECREASING_COEFFICIENT_ALBUM = 0.3;

    public Album(int id, String title, int numberOfPages, int releaseYear, double initialPrice, String designer, String genre) {
        super(id, title, numberOfPages, releaseYear, initialPrice, genre);
        this.designer = designer;
    }

    public Album() {
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    @Override
    public double calculateCurrentPrice() {
        return getInitialPrice() - (CURRENT_YEAR - getReleaseYear()) * DECREASING_COEFFICIENT_ALBUM;
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
        return super.toString() +
                ", designer='" + designer + '\'';
    }
}
