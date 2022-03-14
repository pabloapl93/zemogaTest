package com.zemoga.service;

import com.zemoga.DTO.PortfolioDTO;
import com.zemoga.entity.Portfolio;
import com.zemoga.repository.PortfolioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PortfolioServiceImplTest {

    @Mock
    private PortfolioRepository portfolioRepository;

    @InjectMocks
    private PortfolioServiceImpl portfolioServiceImpl;

    private  Portfolio portfolio = new Portfolio();

    private PortfolioDTO portfolioDTO = new PortfolioDTO();

    @BeforeEach
    void setUp(){
        portfolio.setId(8L);
        portfolio.setPhone("4444444");
        portfolio.setName("Pablo Paez");
        portfolio.setEmail("test@zemoga.com");

        portfolioDTO.setId(8L);
        portfolioDTO.setPhone("4444444");
        portfolioDTO.setName("Pablo Paez");
        portfolioDTO.setEmail("test@zemoga.com");

    }

    @Test
    void findById(){

        Optional<Portfolio> portfolioOpt = Optional.of(portfolio);
        when(portfolioRepository.findById(8L)).thenReturn(portfolioOpt);
        assertNotNull(portfolioServiceImpl.findById(8L));
    }

    @Test
    void updateUser(){
        Optional<Portfolio> portfolioOpt = Optional.of(portfolio);
        when(portfolioRepository.findById(8L)).thenReturn(portfolioOpt);
        assertNotNull(portfolioServiceImpl.updateUser(portfolioDTO));
    }
}