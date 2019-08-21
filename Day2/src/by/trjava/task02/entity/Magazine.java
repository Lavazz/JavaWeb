package by.trjava.task02.entity;

public class Magazine extends Edition {
    private static final double DECREASING_COEFFICIENT_MAGAZINE = 0.3;

    private String editor;
    private int releaseMonth;

    public Magazine(int id, String title, int numberOfPages, int releaseYear, double initialPrice, String editor
            , int releaseMonth, String genre) {
        super(id, title, numberOfPages, releaseYear, initialPrice, genre);
        this.releaseMonth = releaseMonth;
        this.editor = editor;
    }

    public Magazine() {
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
    public double calculateCurrentPrice() {
        return getInitialPrice() - ((CURRENT_YEAR - getReleaseYear()) * 12 + (CURRENT_MONTH - releaseMonth))
                * DECREASING_COEFFICIENT_MAGAZINE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) return false;
        Magazine other = (Magazine) obj;
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
        return (int) (super.hashCode() + (editor == null ? 0 : editor.hashCode())
                + releaseMonth);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", editor='" + editor + '\'' +
                ", releaseMonth=" + releaseMonth;
    }
}
