package org.ritik.transaction;

import java.time.LocalDate;

public class Transaction {

	int txId;
	LocalDate txDate;
	float txAmount;
	boolean txStatus;
	boolean txArrears;
	
	public Transaction(int txId, LocalDate txDate, float txAmount, boolean txStatus, boolean txArrears) {
		super();
		this.txId = txId;
		this.txDate = txDate;
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}
	
	public int getTxId() {
		return txId;
	}

	public void setTxId(int txId) {
		this.txId = txId;
	}

	public LocalDate getTxDate() {
		return txDate;
	}

	public void setTxDate(LocalDate txDate) {
		this.txDate = txDate;
	}

	public float getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(float txAmount) {
		this.txAmount = txAmount;
	}

	public boolean isTxStatus() {
		return txStatus;
	}

	public void setTxStatus(boolean txStatus) {
		this.txStatus = txStatus;
	}

	public boolean isTxArrears() {
		return txArrears;
	}

	public void setTxArrears(boolean txArrears) {
		this.txArrears = txArrears;
	}

	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", txDate=" + txDate + ", txAmount=" + txAmount + ", txStatus=" + txStatus
				+ ", txArrears=" + txArrears + "]";
	}

	
	
}
