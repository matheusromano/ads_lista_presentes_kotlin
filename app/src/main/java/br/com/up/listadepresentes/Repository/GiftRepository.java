package br.com.up.listadepresentes.Repository;

import java.util.ArrayList;

import br.com.up.listadepresentes.models.Gift;

public class GiftRepository {

    private static GiftRepository repository;

    public static GiftRepository getInstance(){
        if(repository == null){
            repository = new GiftRepository();
        }
        return repository;
    }

    private GiftRepository(){}

    private ArrayList<Gift> gifts = new ArrayList<>();

    public void save(Gift gift){
        gifts.add(gift);

    }

    public void delete(Gift gift){
        gifts.remove(gift);

    }

    public ArrayList<Gift> getAll(){
        return gifts;
    }

    public void update(int index, Gift gift){
        gifts.set(index, gift);

    }

    public Gift getByIndex(int index){
        return gifts.get(index);
    }
}
