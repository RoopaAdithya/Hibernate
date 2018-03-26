package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.beans.BankBean;
import com.dao.Bank;

@Component
public class BankServiceImpl {

	@Autowired
	Bank bb;

	public void addBank(BankBean b) {

		bb.addBank(b);

	}

	public void updateBank(BankBean b) {

		bb.updateBank(b);
	}

	public void deleteBank(int bid) {
		bb.deleteBank(bid);
	}

	public List<BankBean> viewAllBanks() {

		List<BankBean> l = bb.viewAllBanks();

		return l;
	}

}
