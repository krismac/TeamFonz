package com.example.PDATool.repository.modules;

import com.example.PDATool.models.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRespository extends JpaRepository<Module, Long>, ModuleRespositoryCustom {



}
