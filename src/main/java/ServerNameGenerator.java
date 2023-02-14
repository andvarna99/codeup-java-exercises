import java.util.Random;

public class ServerNameGenerator {
    static String [] adjectives = {"adorable","adventurous","aggressive","busy","beautiful","bright","calm","cautious","crazy","dangerous"};
    static String [] nouns = {"table","car","banana","money","music","love","dog","cat","time","family"};

    public static String getRandom(String[] array){
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
    public static void main(String[] args) {
        System.out.println( "Your server name is: " + getRandom(adjectives) + "-" + getRandom(nouns));

    }
}
