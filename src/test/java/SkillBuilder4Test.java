import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class SkillBuilder4Test {
    private static Random random = new Random();
    private static String alphabet = "abcdefghijklmnopqrsuvwxz ABCDEFGHIJKLMNOPQRSUVWXZ";


    private String getRandomString(){
        String randString = "";
        for (int i = 0; i < random.nextInt(8); i++) {
            randString += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return randString;
    }
    @Test
    @DisplayName("[2] test findTYPattern_1")
    void findTYPattern_1() {
        String expected = "";
        String actual = SkillBuilder4.findTYPattern("If the forest is blue, then what?");
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual: "+actual);
    }

    @Test
    @DisplayName("[2] test findTYPattern_2")
    void findTYPattern_2() {
        String randStr = getRandomString();
        String expected = "this"+randStr+"testy";
        String actual = SkillBuilder4.findTYPattern("I am checking this"+randStr+"testy.");
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual: "+actual);
    }

    @Test
    @DisplayName("[2] test findTYPattern_3")
    void findTYPattern_3() {
        String randStr = getRandomString();
        String expected = "THIS"+randStr+"TEST THOUROUGHLY";
        String actual = SkillBuilder4.findTYPattern("I AM CHECKING THIS"+randStr+"TEST THOUROUGHLY DUDE!");
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual: "+actual);
    }
}