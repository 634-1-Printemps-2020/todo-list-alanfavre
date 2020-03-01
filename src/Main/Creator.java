package Main;

import java.util.Objects;

public class Creator
{
    private String first_name;
    private String last_name;

    public Creator(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString()
    {
        return "Creator{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creator creator = (Creator) o;
        return Objects.equals(first_name, creator.first_name) &&
                Objects.equals(last_name, creator.last_name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(first_name, last_name);
    }
}
