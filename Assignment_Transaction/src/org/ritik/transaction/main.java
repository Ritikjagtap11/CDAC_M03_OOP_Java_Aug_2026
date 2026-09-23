package org.ritik.transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

import org.ritik.consoleinput.ConsoleInput;

public class main {

    public static void main(String[] args) {

        ArrayList<Transaction> transactionArr = new ArrayList<>();

        // Taking 5 Transactions
        for (int iTmp = 0; iTmp < 5; iTmp++) {

            System.out.print("Enter a Transaction Id: ");
            int txId = ConsoleInput.getInt();

            LocalDate txDate = LocalDate.now();

            System.out.print("Enter a Transaction Amount: ");
            float txAmount = ConsoleInput.getFloat();

            System.out.print("Enter a Transaction Status: ");
            boolean txStatus = ConsoleInput.getBoolean();

            System.out.print("Enter a Transaction Arrears: ");
            boolean txArrears = ConsoleInput.getBoolean();

            Transaction objTransaction =
                    new Transaction(txId, txDate, txAmount, txStatus, txArrears);

            transactionArr.add(objTransaction);
        }


   
        // 1. Get all amount > 5000
        
        Function<Transaction, Float> f1 = (transaction) ->
                (transaction.getTxAmount() > 5000)
                ? transaction.getTxAmount()
                : 0.0f;

        Iterator<Transaction> itrTransaction = transactionArr.iterator();

        while (itrTransaction.hasNext()) {

            Float amount = f1.apply(itrTransaction.next());

            if (amount > 0) {
                System.out.println("Amount > 5000: " + amount);
            }
        }


        // 2. Get all Transactions where txStatus is false

        Predicate<Transaction> p = (transaction) ->
                !transaction.isTxStatus();

        itrTransaction = transactionArr.iterator();

        while (itrTransaction.hasNext()) {

            Transaction transaction = itrTransaction.next();

            if (p.test(transaction)) {

                System.out.println("Id: " + transaction.getTxId());
                System.out.println("Amount: " + transaction.getTxAmount());
                System.out.println("Date: " + transaction.getTxDate());
                System.out.println("Status: " + transaction.isTxStatus());
                System.out.println("Arrears: " + transaction.isTxArrears());

                System.out.println("-------------------------");
            }
        }



        // 3. Generate Amount Due

        Function<Transaction, Float> f2 = (transaction) -> {

            if (transaction.isTxArrears()) {

                float tax = transaction.getTxAmount() * (18.0f / 100.0f);

                return transaction.getTxAmount() + 500.0f + tax;
            }

            return transaction.getTxAmount();
        };

        itrTransaction = transactionArr.iterator();

        while (itrTransaction.hasNext()) {

            Float amount = f2.apply(itrTransaction.next());

            System.out.println("Amount Due: " + amount);
        }
    }
}