package org.example.lab3.model;

import java.util.List;
import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class University {

    private String name;
    private Human head;
    private List<Faculty> faculties;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        University that = (University) o;

        if (!Objects.equals(name, that.name)) {
            return false;
        }
        if (!Objects.equals(head, that.head)) {
            return false;
        }
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + (faculties != null ? faculties.hashCode() : 0);
        return result;
    }
}
