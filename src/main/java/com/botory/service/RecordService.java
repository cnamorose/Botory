package com.botory.service;

import com.botory.entity.Record;
import com.botory.entity.User;
import com.botory.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    private final RecordRepository repository;

    public RecordService(RecordRepository repository) {
        this.repository = repository;
    }

    public void save(Record record) {
        repository.save(record);
    }

    public List<Record> getRecordsByUser(User user) {
        return repository.findByUser(user);
    }

    public Record getRecordById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
