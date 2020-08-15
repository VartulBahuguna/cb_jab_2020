package lec_25_04_2020;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapAL<K,V>
{

    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    private int size = 0;
    private float lf = 0.5f;

    public HashMapAL()
    {
        for (int i = 0; i < 100 ; i++) {
            entities.add(new LinkedList<Entity>());
        }
    }

    public void put(K key, V value)
    {

        int hashcode = Math.abs(key.hashCode() % entities.size());

        LinkedList<Entity> list = entities.get(hashcode) ;

        for (Entity entity : list)
        {
            if(entity.key.equals(key))
            {
               entity.value = value;
               return;
            }
        }

        list.add(new Entity(key,value));

        size++;
    }

    public V get(K key)
    {
        int hascode = Math.abs(key.hashCode() % entities.size());

        LinkedList<Entity> list = entities.get(hascode);

        for (Entity entity : list)
        {
            if(entity.key.equals(key))
            {
                return entity.value ;
            }
        }

        return null;
    }


    public void remove(K key)
    {

        if(((float)(size)) / entities.size() > 0.5)
        {
            rehash();
        }
        int hashcode = Math.abs(key.hashCode() % entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity : list)
        {
            if(entity.key.equals(key))
            {
                list.remove(entity);
                size--;
                break;
            }
        }
    }

    private void rehash()
    {
        ArrayList<LinkedList<Entity>> old = entities;

        entities = new ArrayList<>();

        for (int i = 0; i < old.size()*2; i++)
        {
            entities.add(new LinkedList<>());
        }

        size = 0 ;

        for (LinkedList<Entity> list : old)
        {
            for (Entity entity : list)
            {
                put(entity.key, entity.value);
            }
        }


    }


    private class Entity
    {
        K key;
        V value;


        public Entity(K key,V value)
        {
            this.key = key;
            this.value = value;
        }
    }

}
