package com.fmi.fmimdb.repository;

import com.fmi.fmimdb.model.Cast;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CastRepository {

    private List<Cast> castList = new ArrayList<>();

    public void addCast(Cast cast) {
        castList.add(cast);
        System.out.println("Added cast " + cast.toString());
    }

    public void removeCast(Cast cast) {
        castList.remove(cast);
        System.out.println("Removed cast " + cast.toString());
    }

    public void updateCast(Cast originalCast, Cast updatedCast) {
        castList.set(castList.indexOf(originalCast), updatedCast);
        System.out.println("Updated cast " + originalCast.toString() + " to " + updatedCast.toString());
    }

    public List<Cast> getAllCast() {
        return castList;
    }

}
