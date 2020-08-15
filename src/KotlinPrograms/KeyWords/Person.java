package KotlinPrograms.KeyWords;

import java.util.*;

public class Person
{

    private String mood = "Normal";

    private HashMap<String, Action> moodAction = new HashMap<String, Action>();

    void setMood(String newMood)
    {
        this.mood = newMood;
        if(moodAction.get(this.mood) != null)
        {
            moodAction.get(this.mood).perform();
        }
    }

    Action when(String mood)
    {
        Action action = new Action();
        moodAction.put(mood,action);
        return  action;
    }

    class Action
    {
        private String say = "";
        private String shout = "";

        void say(String it)
        {
            this.say = it;
        }

        void shout(String it)
        {
            this.shout = it;
        }

        public void perform()
        {
            if(!say.isEmpty()) System.out.println(say);
            if(!shout.isEmpty()) System.out.println(shout.toUpperCase());
        }
    }


}
