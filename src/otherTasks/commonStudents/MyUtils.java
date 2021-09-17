package otherTasks.commonStudents;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class MyUtils {
    public static class Student {
        private int id;
        private String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

    }

    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        Set<Student> students = new HashSet<>();
        for (Student studentFromFirstList : list1
        ) {
            for (Student studentFromSecondList : list2
            ) {
                if (studentFromFirstList.equals(studentFromSecondList)) {
                    students.add(studentFromFirstList);
                }
            }

        }

        return students;
    }
}