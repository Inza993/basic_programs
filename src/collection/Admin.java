package collection;

import java.util.Objects;

public class Admin implements Comparable<Admin> {
    String name;
    int id;
    int age;

    public Admin(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Admin admin)) return false;
        return id == admin.id && age == admin.age && Objects.equals(name, admin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Admin o) {
        if (this.name.equals(o.name))
            return 0;
        else if (this.name.compareTo(o.name) > 0)
            return 1;
        return -1;
    }
}
