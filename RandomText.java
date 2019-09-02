package androidsnippets.randomtext;

/**
 * Utilities for Random Text.
 */
public class RandomText {

    public static final String[] RANDOM_TEXTS = {
            // list of texts to choose from
            "This is a random text.",
            "this is another random text"
    }
    public double randomdouble = 5.0;
    public static String getRandom() {        

        Random random = new Random();

        double score = random.nextDouble() * randomdouble;
        String text = RANDOM_TEXTS[(int) Math.floor(score)];
        return text;
    }
}


