import java.util.Objects;

public class Data {
        private String name;
        private String surname;
        private String number;

        public Data(String name, String surname, String number) {
                this.name = name;
                this.surname = surname;
                this.number = number;
        }

        @Override
        public String toString() {
                return "Data{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", number=" + number +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Data data = (Data) o;
                return Objects.equals(name, data.name) && Objects.equals(surname, data.surname);
        }

        @Override
        public int hashCode() {
                return Objects.hash(name, surname);
        }
}
