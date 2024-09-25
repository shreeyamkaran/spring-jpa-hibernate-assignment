package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Result;
import jakarta.validation.Valid;

import java.util.List;

public interface ResultService {

    List<Result> fetchAllResults();

    Result createResult(@Valid Result result);

    Result fetchResult(Integer resultId);
}
