package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {

    @Autowired
    private FilmeRepository filmeRepository;

    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFilmeResponseMapper();

    public List<FilmeResponse> getFilmes() {
        final List<FilmeEntity> filmes = filmesRepository.getFilmes();
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequest request) {
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmeSalvar);
    } public List<FilmesResponse> getFilmes() {
        final List<FilmeEntity> filmes = filmesRepository.getFilmes();
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequest request) {
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmeSalvar);
    }

    //TODO falta parte de consultar por ID (detalhes)
}
