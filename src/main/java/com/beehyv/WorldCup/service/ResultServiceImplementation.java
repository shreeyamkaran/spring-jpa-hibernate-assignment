package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Result;
import com.beehyv.WorldCup.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImplementation implements ResultService {

    private final ResultRepository resultRepository;

    public ResultServiceImplementation(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<Result> fetchAllResults() {
        return resultRepository.findAll();
    }

    @Override
    public Result createResult(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public Result fetchResult(Integer resultId) {
        return resultRepository.findById(resultId).orElse(null);
    }
}
