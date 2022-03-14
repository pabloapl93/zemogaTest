package com.zemoga.service;

import com.zemoga.DTO.PortfolioDTO;
import com.zemoga.entity.Portfolio;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface PortfolioService {

    public ResponseEntity<?> findById(Long id);

    public ResponseEntity<?> updateUser(PortfolioDTO portfolioUpdated);
}
