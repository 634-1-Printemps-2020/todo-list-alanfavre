package Main;

import java.util.Date;
import java.util.Objects;

public class Task
{
    private Creator creator;
    private String description;
    private Date date;
    private Status status;
    private Resolution resolution;

    public Task(Creator creator, String description, Date date, Status status, Resolution resolution)
    {
        this.creator = creator;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }

    public Creator getCreator()
    {
        return creator;
    }

    public String getDescription()
    {
        return description;
    }

    public Date getDate()
    {
        return date;
    }

    public Status getStatus()
    {
        return status;
    }

    public Resolution getResolution()
    {
        return resolution;
    }

    public void setCreator(Creator creator)
    {
        this.creator = creator;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public void setResolution(Resolution resolution)
    {
        this.resolution = resolution;
    }

    @Override
    public String toString()
    {
        return "Task{" +
                "creator=" + creator +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", status=" + status +
                ", resolution=" + resolution +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(creator, task.creator) &&
                Objects.equals(description, task.description) &&
                Objects.equals(date, task.date) &&
                status == task.status &&
                resolution == task.resolution;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(creator, description, date, status, resolution);
    }
}
