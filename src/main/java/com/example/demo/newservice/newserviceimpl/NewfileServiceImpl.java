package com.example.demo.newserviceimpl;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class NewfileServiceImpl implements NewfileService{
    private final NewfileRepo rep;

    NewfileServiceImpl(){
        this.rep=rep;
    }
    @Override
    public NewfileEntity savedata(NewfileEntity newfile){

    }
    @Override
    public NewfileEntity getidval(Long id){

    }
    @Override
    public List<NewfileEntity> getall(){
        
    }
    @Override
    public NewfileEntity update(Long id,NewfileEntity newfile){
        
    }
    @Override
    public void delete(Long id){
        
    }
}