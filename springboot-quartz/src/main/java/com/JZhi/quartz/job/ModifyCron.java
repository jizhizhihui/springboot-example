package com.JZhi.quartz.job;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class ModifyCron{
    @NotNull(message = "the job id cannot be null")
    private Integer id;

    @NotEmpty(message = "the cron cannot be empty")
    private String cron;
}
