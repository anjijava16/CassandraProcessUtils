package com.mmtech.mmpocspringcass.repository;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mmtech.mmpocspringcass.entity.ExampleTable;

import java.util.List;

public interface ExampleTableRepository extends CrudRepository<ExampleTable, String> {

    @Query("Select * from mmtechwork.example_table where text_field_1=?0")
    List<ExampleTable> findByTextField1(String textField1);

}

