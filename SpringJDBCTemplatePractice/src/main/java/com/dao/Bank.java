package com.dao;


import java.util.List;

import com.beans.BankBean;

public interface Bank {

	void addBank(BankBean b);
	void updateBank(BankBean b);
	void deleteBank(int bid);
	List<BankBean> viewAllBanks();

}
