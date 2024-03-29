package edu.example.repository;

import edu.example.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FileRepository extends JpaRepository<FileModel, Long> {

    Optional<FileModel> findBySavedByName(String savedName);
}
