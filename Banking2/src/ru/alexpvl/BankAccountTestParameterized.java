package ru.alexpvl;


public class BankAccountTestParameterized {
    private BankAccount account;

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
}
