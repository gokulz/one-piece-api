package com.gokulcodes.onepieceapi.service;

import java.util.List;

import com.gokulcodes.onepieceapi.entity.OnePiece;

public interface OnePieceService {
     //create and update
    OnePiece save(OnePiece theOnePiece);
    //to read all

     List<OnePiece> findAll();
     //to find by id
     OnePiece findById(int id);
     //delete by id
     void deleteById(int id);
    
} 
