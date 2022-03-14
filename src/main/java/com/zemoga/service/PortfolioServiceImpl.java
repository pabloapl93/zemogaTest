package com.zemoga.service;

import com.zemoga.DTO.PortfolioDTO;
import com.zemoga.entity.Portfolio;
import com.zemoga.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PortfolioServiceImpl implements PortfolioService{

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<?> findById(Long id) {

        Optional<Portfolio> portfolio = portfolioRepository.findById(id);

        if(portfolio.isPresent()){
            return ResponseEntity.ok(portfolio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    @Transactional
    public ResponseEntity<?> updateUser(PortfolioDTO portfolioUpdated){
        Optional<Portfolio> portfolio = portfolioRepository.findById(portfolioUpdated.getId());

        if(!portfolio.isPresent()){
            return ResponseEntity.ok(portfolio);
        }

        portfolio.get().setAddress(portfolioUpdated.getAddress());
        portfolio.get().setEmail(portfolioUpdated.getEmail());
        portfolio.get().setExperience(portfolioUpdated.getExperience());
        portfolio.get().setImagePath(portfolioUpdated.getImagePath());
        portfolio.get().setName(portfolioUpdated.getName());
        portfolio.get().setPhone(portfolioUpdated.getPhone());
        portfolio.get().setTwitterUser(portfolioUpdated.getTwitterUser());

        return ResponseEntity.status(HttpStatus.CREATED).body(portfolioRepository.save(portfolio.get()));
    }
}
