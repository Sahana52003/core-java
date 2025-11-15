package com.xworkz.objclass.internal;

public class Movie {
    public String title;
    public int releaseYear;
    public double rating;
    public boolean isHit;
    public char category;

    public Movie() {
        System.out.println("Movie has been released");
    }

    public Movie(String title, int releaseYear, double rating, boolean isHit, char category) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.isHit = isHit;
        this.category = category;
    }

    public String toString() {
        return "Movie{Movie name " + this.title + " and it's been released in " + this.releaseYear + " having a ratings " + this.rating + "ismovie is" + this.isHit + "has a category" + this.category + "}";
    }

    public boolean equals(Object movi) {
        if (this == movi) {
            return true;
        } else if (!(movi instanceof Movie)) {
            return false;
        } else {
            Movie movie = (Movie)movi;
            return this.title.equals(movie.title) && this.releaseYear == movie.releaseYear && this.rating == movie.rating && this.isHit == movie.isHit && this.category == movie.category;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.title.hashCode();
        res = 5 * res + this.releaseYear;
        res = 5 * res + (int)this.rating;
        res = 5 * res + (this.isHit ? 1 : 0);
        res = 5 * res + this.category;
        return res;
    }
}
