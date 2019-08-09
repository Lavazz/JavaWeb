package by.trjava.task02.entity;

/**
 * This class representing fields, characterizing printed publications that may be in the library
 * contains getters and setters for this fields
 * class contains also Override methods toString, hashCode and equals
 * Abstract method {@code calculateCurrentPrice} allows you to calculate the current cost of publication
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK 1.0
 */

public abstract class Edition {
    public static final int CURRENT_YEAR = 2019;
    public static final int CURRENT_MONTH = 8;
    private int id;
    String genre;
    private String title;
    private int numberOfPages;
    private int releaseYear;
    private double initialPrice;

    public Edition(int id, String title, int numberOfPages, int releaseYear, double initialPrice, String genre) {
        this.id = id;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;
        this.initialPrice = initialPrice;
        this.genre=genre;
    }

    public abstract double calculateCurrentPrice(double initialPrice, int releaseYear);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
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
        Edition other = (Edition) obj;
        if (id != other.id) {
            return false;
        }
        if (genre == null) {
            if (other.genre != null) {
                return false;
            } else if (!genre.equals(other.genre)) {
                return false;
            }
        }
        if (numberOfPages != other.numberOfPages) {
            return false;
        }
        if (releaseYear != other.releaseYear) {
            return false;
        }
        if (initialPrice != other.initialPrice) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            } else if (!title.equals(other.title)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (title == null ? 0 : title.hashCode())+(genre == null ? 0 : genre.hashCode()) + numberOfPages + releaseYear
                + initialPrice);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@ " +
                "id=" + id +
                ", genre='"+genre+ '\''+
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear+
                ", numberOfPages=" + numberOfPages +
                ", initialPrice=" + initialPrice ;
    }

}
