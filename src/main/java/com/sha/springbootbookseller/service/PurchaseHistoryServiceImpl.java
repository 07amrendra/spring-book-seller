package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.PurchaseHistoryRepository;
import com.sha.springbootbookseller.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryServiceImpl implements PurchaseHistoryService{
    @Autowired
    private PurchaseHistoryRepository purchaseHistoryRepository;
    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }
    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId){
        return purchaseHistoryRepository.findAllPurchases(userId);
    }
}
