package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.beans.BankBean;
import com.dao.Bank;

@Component
public class BankImpl implements Bank {

	@Autowired
	JdbcTemplate jdbctemplate;

	public void addBank(BankBean b) {

		jdbctemplate.update("insert into bank(bank_name,address) values(?,?)",
				b.getBankName(), b.getAddress());
		System.out.println("Bank Inserted");
	}

	public void updateBank(BankBean b) {
		jdbctemplate.update(
				"UPDATE bank SET bank_name = ?  WHERE bank_id = ? ",
				b.getBankName(), b.getBankId());
		System.out.println("Bank Updated!!");
	}

	public void deleteBank(int bid) {
		jdbctemplate.update("delete from bank wHERE bank_id = ? ", bid);
		System.out.println("Bank deleted!!");
	}

	public List<BankBean> viewAllBanks() {
		List<BankBean> b = jdbctemplate.query("SELECT * FROM bank",
				new BeanPropertyRowMapper(BankBean.class));

		return b;
	}

}
