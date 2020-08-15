package lec_25_04_2020;

import practice.LL_kReverse;

import java.util.LinkedList;

public class HashMapLL
{

    private LinkedList<Entity> list = new LinkedList<>();

    public void put(String key, String value)
    {

        for (Entity entity : list)
        {
            if(entity.key.equals(key))
            {
                entity.value = value;
                return;
            }
        }

        list.add(new Entity(key,value));
    }

    public String get(String key)
    {

        for (Entity entity: list)
        {

            if(entity.key.equals(key))
            {
                return entity.value;
            }

        }

        return null;
    }


    public void remove(String key)
    {
        for (Entity entity : list)
        {
            if(entity.key.equals(key))
            {
                list.remove(entity);
            }
        }
    }

    @Override
    public String toString()
    {
        String str = "[";

        for (Entity entity : list)
        {
            str += entity.key + ":" + entity.value + "," ;
        }

        str += "]";
        return str;
    }

    private class Entity
    {
        String key;
        String value;


        public Entity(String key,String value) {
            this.key = key;
            this.value = value;
        }
    }

}
