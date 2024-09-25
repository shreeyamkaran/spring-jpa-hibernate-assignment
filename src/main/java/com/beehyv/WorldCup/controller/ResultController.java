package com.beehyv.WorldCup.controller;

import com.beehyv.WorldCup.entity.Result;
import com.beehyv.WorldCup.service.ResultService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/results")
    public List<Result> fetchAllResults() {
        return resultService.fetchAllResults();
    }

    @PostMapping("/results")
    public Result createResult(@Valid @RequestBody Result result) {
        return resultService.createResult(result);
    }

    @GetMapping("/results/{result-id}")
    public Result fetchResult(@PathVariable("result-id") Integer resultId) {
        return resultService.fetchResult(resultId);
    }

}
