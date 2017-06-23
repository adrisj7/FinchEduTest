
/********************
 * First Finch edu test class!
 *
 *
 *******************/

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Main {

    public static void main(String[] args) {
        Finch finch = new Finch();
 
        finch.setLED(255, 255, 255);
        finch.sleep(1000);
        finch.buzz(440, 1000);
        finch.saySomething("Hello Universe");
    }

}
