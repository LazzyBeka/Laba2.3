import com.google.gson.Gson;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Objects;

@Immutable
public final class person {
    String Name;
    int Weight;
    int Age;

    public person(String name, int weight, int age) {
        Name = name;
        Weight = weight;
        Age = age;
    }

    static public String Serialization(person o)
    {
        Gson gson = new Gson();
        return gson.toJson(o);
    }

    static public person Deserialization(String jsonString)
    {
        Gson gson= new Gson();
        return gson.fromJson(jsonString, person.class);
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Age == person.Age &&
                Objects.equals(Name, person.Name) &&
                Weight == person.Weight;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(Name, Weight, Age);
    }
}

