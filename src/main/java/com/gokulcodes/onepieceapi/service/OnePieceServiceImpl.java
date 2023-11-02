package com.gokulcodes.onepieceapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gokulcodes.onepieceapi.dao.OnePieceDAO;
import com.gokulcodes.onepieceapi.entity.OnePiece;

import jakarta.transaction.Transactional;

@Service
public class OnePieceServiceImpl implements OnePieceService {

    //define the dao

    private OnePieceDAO onePieceDAO;


    public OnePieceServiceImpl(OnePieceDAO onePieceDAO) {
        this.onePieceDAO = onePieceDAO;
    }


    @Override
    @Transactional
    public OnePiece save(OnePiece theOnePiece) {
        
        return onePieceDAO.save(theOnePiece);
    }


    @Override
    public List<OnePiece> findAll() {
       
        return onePieceDAO.findAll();
    }


    @Override
    public OnePiece findById(int id) {
    
        return onePieceDAO.findById(id);
    }


    @Override
    @Transactional
    public void deleteById(int id) {
      onePieceDAO.deleteById(id);
        
    }
    
}
