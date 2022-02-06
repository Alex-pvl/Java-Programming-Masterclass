package ru.alexpvl;

public class Main {

    public static void main(String[] args) {
	    final PolitePerson p1 = new PolitePerson("Jane");
	    final PolitePerson p2 = new PolitePerson("John");

        new Thread(() -> p1.sayHello(p2)).start();
        new Thread(() -> p2.sayHello(p1)).start();
    }

    record PolitePerson(String name) {

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}
