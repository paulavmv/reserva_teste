package com.teste.reservafacil.service;

import com.teste.reservafacil.entity.ScheduledTransfer;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by paula on 21/10/18.
 */
@RestController
public class TransferController {

    @GetMapping(value = "/scheduled_transfer", params = {"beginDate", "endDate", "value"})
    public List<ScheduledTransfer> getScheduledTransfer(@RequestParam("beginDate") LocalDate beginDate,
                                                        @RequestParam("endDate") LocalDate endDate,
                                                        @RequestParam("value") Double value){
        return null;
    }

    @PostMapping("/scheduled_transfer")
    public ScheduledTransfer addScheduledTransfer(@RequestBody ScheduledTransfer transfer){
        return null;
    }

}
