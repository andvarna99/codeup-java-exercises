import java.util.Random;

public class ServerNameGenerator {
    //random object, like math object
    private static Random random = new Random();
    private static String [] adjectives = {"adorable","adventurous","aggressive","busy","beautiful","bright","calm","cautious","crazy","dangerous"};
    private static String [] nouns = {"table","car","banana","money","music","love","dog","cat","time","family"};

    //when you declare instance variables its about who need to
    // see them outside the class, by default make variables private
    //depending on the implementation of a variable outside a class is dangerous

    //does anybody on the outside need access to the method? by default
    //make methods public then reevaluate if it needs to be private
    public static String getRandom(String[] array){
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
    public static void main(String[] args) {
        System.out.println( "Your server name is: " + getRandom(adjectives) + "-" + getRandom(nouns));

    }
}
