package com.gokulcodes.onepieceapi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokulcodes.onepieceapi.entity.OnePiece;
import com.gokulcodes.onepieceapi.service.OnePieceService;

@RestController
@RequestMapping("/api")
public class OnePieceRestController {
     private OnePieceService onePieceService;
     

    public OnePieceRestController(OnePieceService onePieceService) {
        this.onePieceService = onePieceService;
    }


    // to get all the data

    @GetMapping("/onepiece")
    public List<OnePiece> findAll(){
        return onePieceService.findAll();
    }

    //find by id
    @GetMapping("/onepiece/{onepieceId}")
    public OnePiece getOnepieceChar(@PathVariable int onepieceId){
        //find the id
        OnePiece theOnePiece = onePieceService.findById(onepieceId);

        if(theOnePiece == null){
            throw new RuntimeException("Id Not Found " + onepieceId);
        }
        return theOnePiece;
        
    }



    //to create
    @PostMapping("/onepiece")
    public OnePiece addOnePieceChar(@RequestBody OnePiece theOnePiece){
        // also just incase they pass an id in json ... set id to  0 
        //this is to forces a save new item ... insetead of update

        theOnePiece.setId(0);

        OnePiece dbOnePiece = onePieceService.save(theOnePiece);

        return dbOnePiece;
        
    }
    //update 

    @PutMapping("/onepiece")
    public OnePiece updateOnePieceChar(@RequestBody OnePiece theOnePiece){
         
        OnePiece dbOnePiece = onePieceService.save(theOnePiece);

        return dbOnePiece;
    }
    @DeleteMapping("/onepiece/{onepieceId}")
    public String deleteOnepieceChar(@PathVariable int onepieceId){
        //find by id
        OnePiece theId = onePieceService.findById(onepieceId);

        if(theId == null){
            throw new RuntimeException("Id not found " + onepieceId);
        }
        onePieceService.deleteById(onepieceId);

        return onepieceId + " successfully deleted ";
    }
     
}
