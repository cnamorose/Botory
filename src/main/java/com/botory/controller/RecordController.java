package com.botory.controller;

import com.botory.entity.Record;
import com.botory.entity.User;
import com.botory.service.RecordService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecordController {

    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/records")
    public String showRecords(HttpSession session, Model model) {
        User user = (User) session.getAttribute("loginUser");
        if (user == null) {
            return "redirect:/login";
        }
        List<Record> records = recordService.getRecordsByUser(user);
        model.addAttribute("records", records);
        return "records";
    }

    @GetMapping("/records/new")
    public String showRecordForm() {
        return "recordForm";
    }

    @PostMapping("/records")
    public String addRecord(@ModelAttribute Record record, HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        if (user == null) {
            return "redirect:/login";
        }
        record.setUser(user);
        recordService.save(record);
        return "redirect:/records";
    }

    @GetMapping("/records/{id}")
    public String showRecordDetail(@PathVariable Long id, Model model) {
        Record record = recordService.getRecordById(id);
        model.addAttribute("record", record);
        return "recordDetail";
    }
}
