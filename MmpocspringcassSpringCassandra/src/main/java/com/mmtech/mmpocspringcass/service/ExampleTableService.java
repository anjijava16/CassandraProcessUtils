package com.mmtech.mmpocspringcass.service;

import java.util.Collection;

import com.mmtech.mmpocspringcass.dto.ExampleTableDTO;

public interface ExampleTableService {

    Collection<ExampleTableDTO> findByTextField1(String textField1);

}
