package GroceryList;


import java.util.Objects;

public class Grocery {
    private String name;
    private String category;
    private Integer count;

    public Grocery(String name, String category, Integer count) {
        this.name = name;
        this.category = category;
        this.count = count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        if(count == 1) {
            return count + " " + name;
        }else{
            return count + " " + name + "'s";
        }
    }

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
