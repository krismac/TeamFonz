package com.example.PDATool.repository.modules;

import com.example.PDATool.models.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public class ModuleRepository extends JpaRepository<Module, Long>, ModuleRepositoryCustom {
}
