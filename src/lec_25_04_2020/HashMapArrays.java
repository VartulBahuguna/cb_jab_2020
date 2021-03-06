package lec_25_04_2020;

public class HashMapArrays
{

    Entity[] entities = new Entity[100];

    public void put(String key, String value)
    {
        int hashcode = Math.abs(key.hashCode() % entities.length);

        entities[hashcode] = new Entity(key, value);
    }

    public String get(String key)
    {
        int hashcode = Math.abs(key.hashCode() % entities.length);

        if(entities[hashcode] != null && entities[hashcode].key.equals(key))
        {
            return entities[hashcode].value;
        }

        return null;
    }


    public void delete(String key)
    {
        int hashcode = Math.abs(key.hashCode() % entities.length);

        if(entities[hashcode] != null && entities[hashcode].key.equals(key))
        {
            entities[hashcode] = null;
        }
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
