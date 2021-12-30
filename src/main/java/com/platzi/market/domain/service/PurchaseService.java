package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.persistence.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private CompraRepository compraRepository;


    //Implementacion de Repositorio de Purchase
    public List<Purchase> getAll() {
        return compraRepository.getAll();
    }

    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraRepository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return compraRepository.save(purchase);
    }


}
