package movies;

public class Movie {
    // plain old java object (POJO) designed to house whatever it means for a movie
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + "--" + category;
    }

    //accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
