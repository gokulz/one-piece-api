package com.gokulcodes.onepieceapi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gokulcodes.onepieceapi.entity.OnePiece;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class OnePieceDAOImpl implements OnePieceDAO {
    
   private EntityManager entityManager;

    public OnePieceDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }




    // create method and also use in update 
    @Override
    public OnePiece save(OnePiece theOnePiece) {
        //save the employeee

        OnePiece dbOnePiece = entityManager.merge(theOnePiece);
       
        return dbOnePiece;
    }




    @Override
    public List<OnePiece> findAll() {
        TypedQuery<OnePiece> theQuery = entityManager.createQuery("From OnePiece ", OnePiece.class);
        List<OnePiece> dbOnePiece = theQuery.getResultList(); 

        return dbOnePiece;
    }




    @Override
    public OnePiece findById(int id) {

        OnePiece theOnePiece = entityManager.find(OnePiece.class, id);
      
        return theOnePiece;
    }




    @Override
    public void deleteById(int id) {
       OnePiece theOnePiece = entityManager.find(OnePiece.class, id);

       entityManager.remove(theOnePiece);
        
    }
    
}
