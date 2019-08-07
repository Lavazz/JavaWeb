package by.trjava.task02.entity;

public class Newspaper extends Edition {
    private static final double DECREASING_COEFFICIENT_NEWSPAPER=0.3;
    String editor;
    int releaseMonth;

    public Newspaper(int id, String title, int numberOfPages, int releaseYear, double initialPrice, String editor
            , int releaseMonth, String genre) {
        super(id, title, numberOfPages, releaseYear, initialPrice, genre);
        this.releaseMonth = releaseMonth;
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public double calculateCurrentPrice(double initialPrice, int releaseYear) {
        return initialPrice - ((CURRENT_YEAR - releaseYear)*12+(CURRENT_MONTH-releaseMonth)) * DECREASING_COEFFICIENT_NEWSPAPER * initialPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Newspaper other = (Newspaper) obj;
        if (editor == null) {
            if (other.editor != null) {
                return false;
            } else if (!editor.equals(other.editor)) {
                return false;
            }
        }
        if (releaseMonth != other.releaseMonth) {
                return false;
             }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (super.hashCode() + releaseMonth + (editor == null ? 0 : editor.hashCode()));
    }

    @Override
    public String toString() {
        return super.toString()+
                ", editor='" + editor + +'\'' +
                ", releaseMonth=" + releaseMonth;
    }
}
