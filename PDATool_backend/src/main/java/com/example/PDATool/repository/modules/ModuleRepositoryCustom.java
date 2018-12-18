package com.example.PDATool.repository.modules;

import com.example.PDATool.models.Module;

import java.util.List;

public interface ModuleRepositoryCustom {

    List<Module> getModuleForStudentWithQuestionId(long student_id, long question_id);

}
