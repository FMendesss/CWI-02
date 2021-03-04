package br.com.cwi.resetflix.mapper;


import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.ArrayList;
import java.util.List;

public class FilmeResponseMapper {
    public List<FilmeResponse> mapear(final List<FilmeEntity> filmes) {
        List<FilmeResponse> filmesResponses = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmes){

            FilmeResponse filmeResponse = new FilmeResponse(filmeEntity.getId(),
                    filmeEntity.getNome());

            filmesResponses.add(filmeResponse);
        }

        return filmesResponses;
    }
}
