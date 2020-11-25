package com.fmi.fmimdb.service;

import com.fmi.fmimdb.model.Cast;
import com.fmi.fmimdb.repository.CastRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastService {

    private CastRepository castRepository;

    public CastService(CastRepository castRepository) {
        this.castRepository = castRepository;
    }

    public void addCast(Cast cast) {
        castRepository.addCast(cast);
    }

    public void removeCast(Cast cast) {
        castRepository.removeCast(cast);
    }

    public void updateMovie(Cast originalCast, Cast updatedCast) {
        castRepository.updateCast(originalCast, updatedCast);
    }

    public List<Cast> getAllMovies() {
        return castRepository.getAllCast();
    }

}
