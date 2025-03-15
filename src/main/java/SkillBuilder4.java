
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants
    final private static String cht = "tT";
    final private static String chy = "yY";

    public static String findTYPattern(String s)
    {
        // replace this line with your code
        String result = "";
        int tIndex = s.toLowerCase().indexOf("t");
        int yIndex = s.toLowerCase().indexOf("y");

        if(tIndex != -1 && yIndex != -1 && yIndex > tIndex){
            result = s.substring(tIndex, yIndex + 1);
        }

        return result;
    }
}
