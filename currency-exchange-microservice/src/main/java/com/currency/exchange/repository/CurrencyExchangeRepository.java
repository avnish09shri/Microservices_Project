package com.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.exchange.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

	CurrencyExchange findByFromAndTo(String from, String to);
	
}
