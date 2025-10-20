package genericandannotation;

import java.awt.*;

public class Main {
    static void main(String[] args) {
        Mentor<?> mentor = new Mentor<>(5);
        System.out.println(mentor.getDeyisen());
       // mentor.setDeyisen(6);

        Mentor<? extends Integer> mentor2 = new Mentor<>(6);
      // mentor2.setDeyisen(7);
        mentor2.getDeyisen();
     //   mentor.myMethod2(mentor);
        System.out.println(mentor.getDeyisen());

        Mentor<? super String> mentor3=new Mentor<>("hello");
        mentor3.setDeyisen("hello2");
        System.out.println(mentor3.getDeyisen());



    }
}
