package com.example.Backend.repository.category;

import com.example.Backend.entity.boards.QuestionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionCategoryRepository extends JpaRepository<QuestionCategory, Long> {
}
