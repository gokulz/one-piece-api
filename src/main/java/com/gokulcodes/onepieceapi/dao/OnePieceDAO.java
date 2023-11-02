package com.gokulcodes.onepieceapi.dao;

import java.util.List;

import com.gokulcodes.onepieceapi.entity.OnePiece;

public interface OnePieceDAO {
    //create and update
    OnePiece save(OnePiece theOnePiece);
    //read all
    List<OnePiece> findAll();

    //find by id
    OnePiece findById(int id);

    //delete the id
    void deleteById(int id);
}
