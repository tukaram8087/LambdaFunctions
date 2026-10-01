package com.bank;

import java.time.LocalDate;
import java.util.Date;

public class Transaction {
	
		private int txtid;
		private String txDate;
		private float txAmount;
		private boolean txStatus;
		private boolean txArrers;
		
		
		public Transaction(int txtid, String txDate, float txAmount, boolean txStatus, boolean txArrers) {
			super();
			this.txtid = txtid;
			this.txDate = txDate;
			this.txAmount = txAmount;
			this.txStatus = txStatus;
			this.txArrers = txArrers;
		}


		public int getTxtid() {
			return txtid;
		}


		public void setTxtid(int txtid) {
			this.txtid = txtid;
		}


		public String getTxDate() {
			return txDate;
		}


		public void setTxDate(String txDate) {
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


		public boolean isTxArrers() {
			return txArrers;
		}


		public void setTxArrers(boolean txArrers) {
			this.txArrers = txArrers;
		}


		@Override
		public String toString() {
			return "Transaction [txtid=" + txtid + ", txDate=" + txDate + ", txAmount=" + txAmount + ", txStatus="
					+ txStatus + ", txArrers=" + txArrers + "]";
		}
	
	

}
