package by.trjava.task02.entity;

public  class Book extends Edition {
    private static final double DECREASING_COEFFICIENT_BOOK=0.3;
    String author;

       public Book(int id, String title, int numberOfPages, int releaseYear, double initialPrice, String author, String genre) {
        super(id, title, numberOfPages, releaseYear, initialPrice, genre);
        this.author = author;
                   }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

     @Override
    public double calculateCurrentPrice(double initialPrice, int releaseYear) {
        return initialPrice-(CURRENT_YEAR-releaseYear)*DECREASING_COEFFICIENT_BOOK*initialPrice;
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
        if (!super.equals(obj)) return false;
        Book other = (Book) obj;
              if (author == null) {
            if (other.author != null) {
                return false;
            } else if (!author.equals(other.author)) {
                return false;
            }
        }
                   return true;
    }

    @Override
    public int hashCode() {
        return (int)(super.hashCode()+ (author == null ? 0 : author.hashCode()));
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", author='" + author + '\'';
    }
}
