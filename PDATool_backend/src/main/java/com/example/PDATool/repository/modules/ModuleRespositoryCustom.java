package com.example.PDATool.repository.modules;

import com.example.PDATool.models.Module;

public interface ModuleRespositoryCustom {

    Module getFirstModuleForStudent(Long student_id);

}
