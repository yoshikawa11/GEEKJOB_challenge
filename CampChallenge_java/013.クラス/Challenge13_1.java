
/**
 *
 * @author masashi
 */
public class Challenge13_1 {

    public static void main(String[] args) {
        Hito ningen = new Hito();
        ningen.setHito("鈴木", 30);
        ningen.print();

    }
}

    class Hito {

        public String name = "";
        public int age = 0;

        public void setHito(String n, int a) {
            this.name = n;
            this.age = a;

        }

        public void print() {
            System.out.println("私は" + this.name + "です。<br>" + this.age + "です。");
        }

    }

