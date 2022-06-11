package com.app.market.domain.service;

import com.app.market.domain.Project;
import com.app.market.domain.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAll(){
        return projectRepository.getAll();
    }
}
